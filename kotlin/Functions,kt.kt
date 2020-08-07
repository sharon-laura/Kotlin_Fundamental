fun main() {
    val user:String = setUser(name = "Laura",hobby = "listen the music",age = 16)
    println(user)
    printUser(name = "Laura")
}
fun setUser(name:String,hobby:String, age: Int) = "My name is $name, my hobby is $hobby and my $age years old"
fun printUser(name: String){
    println("my name is $name")
}