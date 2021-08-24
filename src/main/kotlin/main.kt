
val algorithmInJava =  AlgorithmInJava::class
fun main(args: Array<String>) {


  //lengthOfLastWord("Hello world     jgh    ")
    isAnagram("anagaram", "nagaram")

    algorithmInJava
}


    fun lengthOfLastWord(s: String): Int {

        val trimmed = s.trim()
        val splitted = trimmed.split(" ")
        val lastWord = splitted.lastIndex

        println(splitted[lastWord].length)
        return splitted[lastWord].length
    }

fun isAnagram ( s: String, t: String): Boolean{

    var isAnagrams = true

    isAnagrams = s.split("").sorted().joinToString("") ==
            t.split("").sorted().joinToString("")

    val strS = s.split("").sorted().joinToString("")
    val strT = t.split("").sorted().joinToString("")

    println("strS: $strS")

    println("strT: $strT")
    println(isAnagrams)

    return isAnagrams
}

