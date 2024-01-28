fun r2d2(){
    try {
        val movs = readln().split(",")
        var pos_x = 0
        var pos_y = 0
        var cont = 0
        var direccion = ""
        while (cont < movs.size){
            when(cont){
                0 -> {if (cont%2 == 0) {
                    pos_y +=movs[cont].toInt()
                    }
                    direccion = "Negative X"}
                1 -> {if (cont%2 == 1){
                    pos_x -= movs[cont].toInt()
                     }
                    direccion = "Negative Y" }
                2 -> {if (cont%2 == 0) {
                    pos_y -=movs[cont].toInt()
                    }
                    direccion = "Positive X"}
                3 -> {if (cont%2 == 1){
                    pos_x += movs[cont].toInt()
                    }
                    direccion = "Positive Y"
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