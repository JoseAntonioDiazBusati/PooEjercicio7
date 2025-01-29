class Persona(val dni: String) {

    private val cuentas: Array<Cuenta?> = arrayOfNulls(3)

    fun anadirCuenta(cuenta: Cuenta): Boolean {
        for (i in cuentas.indices) {
            if (cuentas[i] == null) {
                cuentas[i] = cuenta
                return true
            }
        }
        return false
    }

    fun esMoroso():Boolean{
        return cuentas.any { it != null && it.saldo < 0 }
    }

    fun transferir(cuentaOrigen: Cuenta, cuentaDestino: Cuenta, cantidad: Double): Boolean {
        if (cuentaOrigen.realizarPagos(cantidad)) {
            cuentaDestino.recibirAbonos(cantidad)
            return true
        }
        return false
    }

}