// When we run the program, this method will be executed
void main() {
    double totalMiles = getTotalMilesRun("runningData.txt");
    System.out.println("Total miles run: " + totalMiles);
}

// Reads the given file and returns the total number of miles run
// This method contains several potential points of failure!
double getTotalMilesRun(String fileName) {
    if (fileName == null || fileName.isEmpty()) {
        throw new IllegalArgumentException("fileName cannot be null or empty");
    }

    Scanner fileScanner = new Scanner(new File(fileName));

    double totalMiles = 0.0;

    while (fileScanner.hasNext()) {
        String line = fileScanner.nextLine();
        String[] parts = line.split(",");

        if (parts.length < 2) {
            System.out.println("Invalid line: " + line);
            continue;
        }

        String name = parts[0];
        double miles = Double.parseDouble(parts[1]);

        totalMiles += miles;
    }

    fileScanner.close();

    return totalMiles;
}
