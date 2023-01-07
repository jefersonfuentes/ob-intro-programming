# Primera parte
def sumar(a, b, c):
    return a + b + c

# Segunda parte

class Coche:
    # Atributo del objeto
    numPuertas = 0
    
    # Método del objeto que incrementa el número de puertas
    def addPuerta(self):
        self.numPuertas += 1

# Declarar función main
def main ():
    # Llamar a la función sumar y pasarle atributos
    resulatado = sumar(5,23,3)
    print(resulatado)

    # Segunda parte

    # Se crea un objeto de la clase Coche
    miChoche = Coche()

    # Añade una puerta al coche
    miChoche.addPuerta()

    # Muestra el número de puertas del Coche
    print("Mi coche tiene " + str(miChoche.numPuertas) + "puertas.")

if __name__ == "__main__":
    main()


    