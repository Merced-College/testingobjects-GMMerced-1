Lab: Testing Objects

Student Name: Goutham Mahesh

CHECKPOINT QUESTIONS:

Q1: What does printing an object with no toString show, and why?
Answer: It prints the ClassName followed by the @ symbol and a hexadecimal number (the hash code of the memory address), for example Dog@1b6d3586. This happens because if toString() is not overridden, Java uses the default Object.toString() method, which simply describes where the object is stored in memory, not what is inside it.

Q2: Record what your fields printed as defaults.

Answer:
name (String): printed null (Reference type)
age (int): printed 0 (Primitive type)
breed (String): printed null (Reference type)

Q3: How do constructors change the initialization story compared to Part B?

Answer: Constructors allow us to ensure an object starts with valid, known data the moment it is created. Instead of starting with null or 0, the Default constructor sets them to safe placeholders (like "Unknown"), and the Parameterized constructor allows us to inject specific data immediately upon creation using the "new" keyword.

Q4: What changed between Part A's printout and Part D's printout? Why is @Override useful?

Answer: In Part A, it printed the memory address hash. In Part D, after adding the toString() method, it printed the actual data inside the object (e.g., Dog{name='Rex'...}). The @Override annotation is useful because it ensures we are correctly replacing the parent class's method; if we made a typo in the method name, the compiler would warn us.

Q5: Why prefer private fields with getters/setters over public fields?

Answer: Private fields (Encapsulation) prevent external code from breaking the object by setting invalid data. By using setters, we can enforce rules. For example, in a setAge(int age) method, we can write an IF statement to ensure the age is not negative. If the fields were public, anyone could set age = -100, which breaks the logic of the program.

REFLECTION ANSWERS

List your class's three fields and their default values before you set anything.
My class is SpaceShip.
modelName (String): Default is null
fuelLevel (double): Default is 0.0
isWarpCapable (boolean): Default is false

Why is encapsulation (private fields + getters/setters) preferred over public fields? Give one concrete validation rule you could add to a setter.

Encapsulation is preferred because it protects the integrity of the data. It acts as a gatekeeper. If fields are public, any part of the program can change them to anything. With private fields, they can only be changed via Setters.

Concrete Validation Rule: In my SpaceShip class, inside setFuelLevel(double level), I added a rule: "if (level >= 0 && level <= 100)". This ensures a ship can never have negative fuel or more than 100% fuel, which would be impossible in reality.