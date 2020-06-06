class Core {
    fun getNumber():Int{
        var randomList = (0..9).shuffled().subList(0,4)
        while(randomList[0]==0){
            randomList = (0..9).shuffled().subList(0,4)
        }
        return randomList[0]*1000+randomList[1]*100+randomList[2]*10+randomList[3]
    }
}
