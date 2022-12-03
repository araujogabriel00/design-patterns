package abstractfactory

interface AbstractFactory<T>{
    fun create(tipoObjeto: String) : T
}