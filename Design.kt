//The original Code was written by Himanshu Bhandari in Cpp.
//Recently, I learnt Kotlin, so to practice I rewrote the code the Cpp code in Kotlin

fun main() {
    println("Enter your name in block letters[Uppercase]:")

    val input = readLine()
    val ime = input?.trim()

    val colors = listOf(
        "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m",
        "\u001B[36m", "\u001B[37m", "\u001B[91m", "\u001B[92m", "\u001B[93m",
        "\u001B[94m", "\u001B[95m", "\u001B[96m", "\u001B[97m", "\u001B[30m"
    )

    ime?.forEachIndexed { index, c ->
        val cUpper = c.toUpperCase()

        if (cUpper in 'A'..'Z') {
            val color = colors[index % colors.size]
            print("$color")

            when (cUpper) {
                'A' -> println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n")
                'B' -> println("..######..\n..#....#..\n..#####...\n..#....#..\n..######..\n")
                'C' -> println("..######..\n..#.......\n..#.......\n..#.......\n..######..\n")
                'D' -> println("..#####...\n..#....#..\n..#....#..\n..#....#..\n..#####...\n")
                'E' -> println("..######..\n..#.......\n..#####...\n..#.......\n..######..\n")
                'F' -> println("..######..\n..#.......\n..#####...\n..#.......\n..#.......\n")
                'G' -> println("..######..\n..#.......\n..#####...\n..#....#..\n..#####...\n")
                'H' -> println("..#....#..\n..#....#..\n..######..\n..#....#..\n..#....#..\n")
                'I' -> println("..######..\n....##....\n....##....\n....##....\n..######..\n")
                'J' -> println("..######..\n....##....\n....##....\n..#.##....\n..####....\n")
                'K' -> println("..#...#...\n..#..#....\n..##......\n..#..#....\n..#...#...\n")
                'L' -> println("..#.......\n..#.......\n..#.......\n..#.......\n..######..\n")
                'M' -> println("..#....#..\n..##..##..\n..#.##.#..\n..#....#..\n..#....#..\n")
                'N' -> println("..#....#..\n..##...#..\n..#.#..#..\n..#..#.#..\n..#...##..\n")
                'O' -> println("..######..\n..#....#..\n..#....#..\n..#....#..\n..######..\n")
                'P' -> println("..######..\n..#....#..\n..######..\n..#.......\n..#.......\n")
                'Q' -> println("..######..\n..#....#..\n..#.#..#..\n..#..#.#..\n..######..\n")
                'R' -> println("..######..\n..#....#..\n..#.##...\n..#...#...\n..#....#..\n")
                'S' -> println("..######..\n..#.......\n..######..\n.......#..\n..######..\n")
                'T' -> println("..######..\n....##....\n....##....\n....##....\n....##....\n")
                'U' -> println("..#....#..\n..#....#..\n..#....#..\n..#....#..\n..######..\n")
                'V' -> println("..#....#..\n..#....#..\n..#....#..\n...#..#...\n....##....\n")
                'W' -> println("..#....#..\n..#....#..\n..#.##.#..\n..##..##..\n..#....#..\n")
                'X' -> println("..#....#..\n...#..#...\n....##....\n...#..#...\n..#....#..\n")
                'Y' -> println("..#....#..\n...#..#...\n....##....\n....##....\n....##....\n")
                'Z' -> println("..######..\n......#...\n.....#....\n....#.....\n..######..\n")
                else -> {}
            }

            print("\u001B[0m") // Reset color
        }
    }

}
