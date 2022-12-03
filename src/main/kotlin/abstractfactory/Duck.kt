package abstractfactory

class Duck : Animal {
    override fun getAnimal(): String {
        return "Duck"
    }

    override fun makeSound(): String {
        return "Squeks"
    }

}