class Cuenta(val numCuenta: Int, saldoDisponible: Double) {

    var saldo: Double = saldoDisponible

    fun salarioDisponible():Double{
        return saldo
    }

    fun recibirAbonos(cantidad: Double){
        require(cantidad > 0) { "La cantidad a abonar debe ser positiva." }
        saldo += cantidad
    }

    fun realizarPagos(cantidad: Double): Boolean{
        require(cantidad > 0) { "La cantidad a pagar debe ser positiva." }
        if (saldo >= cantidad) {
            saldo -= cantidad
            return true
        } else {
            return false
        }
    }
}