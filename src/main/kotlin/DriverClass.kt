class DriverClass {
}

fun main() {

    val amit = Fan("Amit")
    val raj = Fan("Raj")

    NewsSystemBuilder.forTeam(Team.CORINTHIANS)
        .subscribe(amit)
        .subscribe(raj)
        .notify("Corinthians has won the FIFA World Cup 2 times.")
        .notify("Great news! Roger Guedes scored a hat trick against Palmeiras!")
        .unsubscribe(amit)
        .notify("Corinthians will face Flamengo in the COPA DO BRASIL semi-finals.")


    NewsSystemBuilder.forTeam(Team.LIVERPOOL)
        .subscribe(amit)
        .notify("Luis Diaz is set to return to Liverpool team training this week having been sidelined since October with a knee injury")
}