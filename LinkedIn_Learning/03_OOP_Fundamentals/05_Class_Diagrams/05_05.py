class Spaceship():
    def __init__(self):

        # instance variables
        self.callSign = ''
        self._shieldStrength = 100
    
    # constructor methods
    def Spaceship():
        name = "The nameless ship"
        shieldStrength = 100
    
    # overload constructor
    def Spaceship(name):
        callSign = name
        shieldStrength = 200
        
    # methods
    def fireMissile(self):
        return "Pew!"

    def reduceShield(self, amount):
        self.shieldStrength -= amount

myShip = Spaceship()