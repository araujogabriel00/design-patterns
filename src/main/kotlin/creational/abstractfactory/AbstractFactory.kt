package creational.abstractfactory

interface AbstractFactory<T>{
    fun create(tipoObjeto: String) : T
}