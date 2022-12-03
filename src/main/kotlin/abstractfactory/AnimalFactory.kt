package abstractfactory

class AnimalFactory : AbstractFactory<Animal?> {

    override fun create(tipoObjeto: String): Animal? {
        if("Dog".equals(tipoObjeto, true)){
            return Dog()
        }else if ("Duck".equals(tipoObjeto, true)){
            return Duck()
        }
        return null
    }

}