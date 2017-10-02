# DesignPatterns-VehicleFacility
Vehicle Factory exercise, using structural and creational design modeling.

**Vehicle Factory task**
The code modeling should contain the next design patterns:
1)Structural design patterns - (Adapter, Facade, Bridge, Composite Decorator, FlyWeight, Proxy)
2)Creational deisgn patterns - (Abstract Factory, Builder, Factory Method, Object Pool, Prototype)
 
**Guide lines**
- Vehicle Model should support the next 4 types, when each type should support their specific abilities
 (For example, Jeep has the Sport, FourXFour and Norma abilities)
- Each type can be Honda or Mazda model.
- The vehicles can be built in Herzlia or Petah Tikva cities only.
- After the vehicle created it should be placed in the warehouse
- There maybe only 1 same type in the warehouse
- If there are vehicles in the warehouse, there should be a possibility to create Toys from the same models and types
- There is no limit on amount of toys of the same type (Vehicles are limited, toys not limited)
- There should be a possibility to export the vehicles and toys to USA and Russia, ONLY if the vehicle or a toy are in the warehouse
 (1 toy or vehicle can be exported each time)
- There should be a DB support for MySql and MongoDB, 
  when the vehicle is created it should have the possibility to be saved in DB when needed. (Just use prints here)

These are the must guide lines in the project, feel free to assume some other functionality if needed.

Types:
- Private (S, H, N)
- Bike (S, H, N, F)
- Truck (S, N)
- Jeep (S, F, N)
Abilities:
Sport, Hover, Norma, FourXFour





