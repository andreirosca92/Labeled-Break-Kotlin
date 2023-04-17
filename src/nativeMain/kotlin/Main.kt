fun main(args:Array<String>) {
    //Let's set a loop as label for break
    loop@ for(i in 1..3){
        for(j in 1..3){
            println("i = $i and j = $j")
            if(i==2)
                break@loop
        }
    }
}