package Interfacce;

public interface Interfaceprova <T> { //Tutti i metodi delle interfacce sono public
	/*Campi staticie e metodi delle interfacce sono tutte pubbliche*/
	<T> int compareTo(T o); //Si possono mettere  solo campi statici e metodi che vengono settati automaticamente a public
	/*IMPORTANTE: un'interfaccia può estendere altre più di un'interfaccia, le classi non possono farlo*/
}
