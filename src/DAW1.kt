import kotlin.random.Random

fun daw1(){
    try {
        val movs = readln().split(",")
        var pos_x = Random.nextInt(-5,5)
        var pos_y = 0
        var cont = 0
        var direccion = "Positive X"
        while (cont < movs.size){
            when(cont % 4){
                0 -> {if (cont%2 == 0) {
                    pos_y +=movs[cont].toInt()
                    }
                    if(pos_x > 0){
                        direccion = "Negative Y"
                    }else{direccion = "Negative X"}
                    }
                1 -> {if (cont%2 == 1){
                    pos_x -= movs[cont].toInt()
                }
                    if (pos_x>0){
                        when{
                            direccion == "Negative Y" -> direccion = "Positive Y"
                            direccion == "Negative X" -> direccion = "Positive X"
                        }
                    } else{direccion = "Negative X"} }
                2 -> if (cont%2 == 0) {
                    pos_y -= movs[cont].toInt()

                    if (pos_x > 0) {
                        when {
                            direccion == "Positive Y" -> direccion = "Negative Y"
                            direccion == "Positive X" -> direccion = "Negative X"
                        }
                    } else direccion = "Positive X"
                }
                3 ->if (cont%2 == 1) {
                    pos_x += movs[cont].toInt()

                    if (pos_x > 0) {
                        when {
                            direccion == "Negative Y" -> direccion = "Positive Y"
                            direccion == "Negative X" -> direccion = "Positive X"
                        }
                        direccion = "Positive Y"
                    }
                }
                4 -> {if (cont%2 == 0){
                    pos_y +=movs[cont].toInt()
                }
                    direccion = "Negative X"}
                else -> {}
            }
            cont++
        }
        println("x: ${pos_x}, y: ${pos_y}, direction: ${direccion}")
    }catch (_:Exception){
        print("x: 0 , y: 0 , direction: Positive Y")
    }
}

