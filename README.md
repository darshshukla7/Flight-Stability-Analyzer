# Aero Flight Stability & Performance Analyzer (AFSPA)

---

## Project Overview

AFSPA is a Java-based aerospace computation tool designed to evaluate flight stability and performance parameters for fixed-wing aircraft. The system computes:

- Static Stability Margin
- Lift Coefficient
- Stall Speed
- Takeoff Feasibility
- CSV based result logging

This tool is intended for academic learning, aeronautical studies, and early-phase conceptual aircraft evaluation.

---

## Project Objective

The objective of this project is to design and implement a computational tool in Java that assists in analyzing key aerodynamic parameters essential for safe aircraft configuration, using real physics-based formulas and structured programming practices.

---

## Features

| Feature | Description |
|--------|------------|
| Static Stability Calculation | Computes stability margin using CG and neutral point |
| Lift Coefficient Estimation | Calculates aerodynamic lift coefficient at a given speed |
| Stall Speed Prediction | Estimates minimum flight speed before stall |
| Takeoff Feasibility Checker | Determines if the available runway length is sufficient |
| CSV Data Logging | Saves calculated values for future reference and comparison |

---

## Functional Requirements

- User input interface for aircraft parameters  
- Computation module for aerodynamic calculations  
- Output display with meaningful interpretation  
- Data storage via CSV logging  

---

## Non-Functional Requirements

- Usability: Simple text-based user interface  
- Performance: Computations completed in real time  
- Maintainability: Based on modular Java OOP structure  
- Reliability: Handles invalid and edge-case input safely  

---

## Technologies and Tools Used

- Java (JDK 8 or higher)
- Object-Oriented Programming
- File Handling (CSV Write/Append)
- Git and GitHub for version control

---

## Repository Structure

```
AFSPA/
│
├── src/
│   ├── AFSPA_Main.java
│   ├── Aircraft.java
│   └── AeroCalculator.java
│
├── data/
│   └── sample_results.csv
│
├── README.md
└── statement.md
```

---

## Installation and Execution

### Step 1: Clone the Repository
```
git clone https://github.com/darshshukla7/AFSPA.git
```

### Step 2: Navigate to Source Folder
```
cd AFSPA/src
```

### Step 3: Compile the Program
```
javac *.java
```

### Step 4: Run the Program
```
java AFSPA_Main
```

---

## Testing Procedure

- Execute the program and provide numeric input values when prompted.
- Verify the output for:
  - Stability margin and classification
  - Computed stall speed
  - Takeoff feasibility evaluation
- Check whether the output record is added to the CSV file inside the `/data` directory.

---

## Example Output

```
-------- ANALYSIS RESULT --------
Static Margin: 7.54% → Stable
Lift Coefficient (Cl): 0.423
Stall Speed: 38.22 m/s
Takeoff Feasibility: Possible

Results saved to: aircraft_results.csv
```

---

## Future Enhancements

- Graphical user interface using Java Swing or JavaFX  
- Support for storing multiple aircraft profiles  
- Plotting tools for aerodynamic graphs  
- Automated PDF report exporting  

---



