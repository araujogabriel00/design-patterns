package abstractfactory

class Dog : Animal {

    override fun getAnimal(): String {
        return "Dog"
    }

    override fun makeSound(): String {
        return "Auuuu"
    }

    override fun toString(): String {
        return getAnimal() + " - "+ makeSound()
    }


}