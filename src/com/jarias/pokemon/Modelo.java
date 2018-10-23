package com.jarias.pokemon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.jarias.pokemon.base.Pokemon;

public class Modelo {

	private HashMap<String, Pokemon> pokemons;
	
	public Modelo() throws IOException, ClassNotFoundException {
		
		if (new File("pokemons.dat").exists())
			deserializar();
		else
			pokemons = new HashMap<>();
	}
	
	public void guardar(Pokemon pokemon) throws IOException {
		
		pokemons.put(pokemon.getNombre(),pokemon);
		serializar();
	}
	
	private void serializar() throws IOException {
		
		ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("pokemons.dat"));
		serializador.writeObject(pokemons);
		serializador.close();
	}
	
	private void deserializar() throws IOException, ClassNotFoundException {
		
		ObjectInputStream deserializador = new ObjectInputStream(new FileInputStream("pokemons.dat"));
		pokemons = (HashMap<String, Pokemon>) deserializador.readObject();
		deserializador.close();
	}
	
	public void eliminar(Pokemon pokemon) {
		
		
	}
	
	public void eliminarTodo() {
		
	}
	
	public void modificarPokemon(String nombre, Pokemon pokemon) {
		
	}
	
	public Pokemon getPokemon(String nombre) {
		return null;
	}
	
	public ArrayList<Pokemon> getPokemons(){
		
		return new ArrayList<Pokemon>(pokemons.values());
	}
	
	public ArrayList<Pokemon> getPokemons(String busqueda){
		return null;
	}
}
