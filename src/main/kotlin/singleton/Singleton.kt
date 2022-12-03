package singleton

class Singleton private constructor(value: String) {

    var value: String

    companion object{
        private var instance : Singleton? = null

        fun  getInstance(value: String): Singleton?{

            if (instance == null){
                instance = Singleton(value)
            }
            return instance
        }
    }

    init {
        try {
            Thread.sleep(1000)
        }catch (ex : InterruptedException){
            ex.printStackTrace()
        }
        this.value = value
    }


}