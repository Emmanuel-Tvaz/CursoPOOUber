from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("SDFR34", Account("Emmanuel Torres", "ASF35"))
    print(vars(car))
    print(vars(car.driver))