fun main(args: Array<String>) {
    val simpsonA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonA.sort()
    for (simpson in simpsonA) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not simpson")
    }
    val simpsonE = arrayOf("Homer", "Marge", "Bard", "Lisa", "Meggie")
    println("simpsons size: " + simpsonE.size)
    if (!simpsonE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonE.minOrNull())
    println("Max = "+ simpsonE.maxOrNull())
    println("First = "+simpsonE.first())
    println("Last = "+simpsonE.last())
    println(simpsonE.contains("Marge"))
}