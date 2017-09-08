#pragma once
class Nodo
{
public:
	Nodo();
	Nodo(int dato, Nodo* siguiente);
	int getDato();
	Nodo* getSiguiente();
	void setDato(int dato);
	void setSiguiente(Nodo* siguiente);
	int dato;
	Nodo* siguiente;
};

