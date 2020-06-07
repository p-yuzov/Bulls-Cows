class Core {
    class BullsCowsStruct {
        var bulls: Int = 0
        var cows: Int = 0
    }
    fun getNumber():Int{
        var randomList = (0..9).shuffled().subList(0,4)
        while(randomList[0]==0){
            randomList = (0..9).shuffled().subList(0,4)
        }
        return randomList[0]*1000+randomList[1]*100+randomList[2]*10+randomList[3]
    }

    fun clearConsole(){
        print("\u001b[H\u001b[2J")
    }

    fun checkInput(s: String?): Boolean {
        if (s != null) {
            if (s.length!=4){
                return false
            }
            if (s.toIntOrNull()==null){
                return false
            }
            for (i in 0..s.length-2){
                for(j in i+1..s.length-1){
                    if (s[i]==s[j]){
                        return false
                    }
                }
            }
            return true
        }
        return false
    }
    fun calcBullsCows(input:String,secret:String):BullsCowsStruct{
        val result = BullsCowsStruct()
        for(i in 0..secret.length-1){
            for(j in 0..input.length-1){
                if(secret[i]==input[j]){
                    if(i==j){
                        result.bulls++
                    }
                    else{
                        result.cows++
                    }
                }
            }
        }
        return result
    }
}
