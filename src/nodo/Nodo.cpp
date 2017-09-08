#include "stdafx.h"
#include "Nodo.h"


Nodo::Nodo()
{
		dato = 0;
		siguiente = NULL;
	}
Nodo::Nodo(int dato, Nodo* siguiente)
	{
		dato = dato;
		siguiente = siguiente;
	}
	int Nodo::getDato()
	{
		return dato;
	}
	Nodo* Nodo::getSiguiente()
	{
		return siguiente;
	}

	void Nodo::setDato(int dato)
	{
		dato = dato;
	}

	void Nodo::setSiguiente(Nodo* siguiente)
	{
		siguiente = siguiente;
	}
