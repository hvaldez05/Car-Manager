# Car-Manager
# CarCatalog Project

## Some comments about Makefile
Within the Makefile we can also compile using:
```bash
find $(SRC_DIR) -name "*.java" | xargs javac -cp $(BIN_DIR) -d $(BIN_DIR)
```

## For rendering the Readme.md in VSCode
Press `Ctrl + Shift + V` to view the Markdown preview.

# My Java Project

This project is a simple Java application that demonstrates how to work with JAR files and create a runnable JAR for managing a car catalog.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project provides a Java program with several classes (`Car`, `Catalog`, `GarageInterface`, `GarageRegistry`, and `StartProgram`) to manage and display information about a catalog of cars. The program includes functionality to add cars, view the catalog, and save data in a CSV file.

## Installation

### Prerequisites
- Java 11+
- Git

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/username/car-catalog-project.git
    ```

2. Navigate to the project directory:
    ```bash
    cd car-catalog-project
    ```

3. Compile the Java files into the `bin` directory:
    ```bash
    javac -d bin -sourcepath src src/*.java
    ```

4. Package the application into a JAR file:
    ```bash
    jar cvfm CarCatalog.jar manifest.txt -C bin .
    ```

## Usage

To run the application, you can use the JAR file or run it from the compiled classes in the `bin` directory.

### Running the JAR file:

```bash
java -jar CarCatalog.jar
```

### Running from `bin` directory:

```bash
java -cp bin StartProgram
```

### Adding a Car
To add a new car to the Apologies! Here’s the continuation and full content for the `README.md` file:

```markdown
# CarCatalog Project

## Some comments about Makefile
Within the Makefile we can also compile using:
```bash
find $(SRC_DIR) -name "*.java" | xargs javac -cp $(BIN_DIR) -d $(BIN_DIR)
```

## For rendering the Readme.md in VSCode
Press `Ctrl + Shift + V` to view the Markdown preview.

# My Java Project

This project is a simple Java application that demonstrates how to work with JAR files and create a runnable JAR for managing a car catalog.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project provides a Java program with several classes (`Car`, `Catalog`, `GarageInterface`, `GarageRegistry`, and `StartProgram`) to manage and display information about a catalog of cars. The program includes functionality to add cars, view the catalog, and save data in a CSV file.

## Installation

### Prerequisites
- Java 11+
- Git

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/username/car-catalog-project.git
    ```

2. Navigate to the project directory:
    ```bash
    cd car-catalog-project
    ```

3. Compile the Java files into the `bin` directory:
    ```bash
    javac -d bin -sourcepath src src/*.java
    ```

4. Package the application into a JAR file:
    ```bash
    jar cvfm CarCatalog.jar manifest.txt -C bin .
    ```

## Usage

To run the application, you can use the JAR file or run it from the compiled classes in the `bin` directory.

### Running the JAR file:

```bash
java -jar CarCatalog.jar
```

### Running from `bin` directory:

```bash
java -cp bin StartProgram
```

### Adding a Car

To add a new car to the catalog, you can enter the following command in the terminal when prompted:

```bash
add [make] [model] [year] [price]
```

For example:
```bash
add Ferrari Spider 2024 625000
```

### Viewing the Car Catalog

To view the entire car catalog, enter the command:

```bash
show
```

This will display all cars currently in the catalog along with their details.

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

