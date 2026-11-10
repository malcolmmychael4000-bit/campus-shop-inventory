campus-shop-inventory

Campus Shop Inventory Management System

Course: Object-Oriented Programming (BUC2125), BBC II, AY 2026/2027
Assessment: Group Take-Home Project (30 marks), deadline 12 November 2026
Language: Java

Group members
1. NAKAVUBU OLIVIA  25/U/15402/PS 
2. IRAGUHA SHELYZE  25/U/15048/EVE 
3. MUGONYA RONALD  25/U/15257/PS 
4. NAMIRO MIRIAM  25/U/15472/EVE
5. SSENKUMBI MALCOLM M  25/U/15668/PS 

What the application does
A console application for a campus shop attendant. It stores product details,
displays them, updates a product's price and stock quantity, and rejects
invalid values such as a negative price.

Project structure
CampusShopInventory/
└── src/
    └── campusshop/
        ├── Product.java   (private attributes, constructor, getters, setters with validation)
        └── Main.java      (creates five Product objects and demonstrates the system)


How to run
### Eclipse

1. Create a Java Project named `CampusShopInventory`.
2. Create a package named `campusshop` inside `src`.
3. Copy `Product.java` and `Main.java` into that package.
4. Right-click `Main.java`, choose **Run As > Java Application**.
5. The output appears in the **Console** tab.

Command line (JDK 17 or later)

Open a terminal in the `src` folder and run:
javac campusshop/*.java
java campusshop.Main

## Validation rules
| Attribute | Rule |
|-----------|------|
| Unit price | Must be greater than zero (negative prices are rejected) |
| Quantity in stock | Must be zero or more (negative stock is rejected) |

When an invalid value is submitted, the setter prints an error message and
keeps the old value.
