class Drill4 {

    String phaseOfWater(int num) {
        if (num >= 100) {
            return "vapor";
        } else if (num < 100 && num > 0) {
            return "liquid";
        } else {
            return "solid";
        }
    }

    int maxProduct(int n1, int n2, int n3) {
        if ((n1 * n2) > (n1*n3) && (n1 * n2) > (n2 * n3)) {
            return n1*n2;
        } else if ((n1*n3) > (n1 * n2)) {
            return n1 * n3;
        } else {
            return n2*n3;
        }
    }

    double pipeVolume(double innerRadius, double outerRadius, double height) {
        return (Math.PI * height) * (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2));
    }

    String phaseOfWaterResult1 = phaseOfWater(101); // Expected: "vapor" 
    String phaseOfWaterResult2 = phaseOfWater(55); // Expected:  "liquid"
    String phaseOfWaterResult3 = phaseOfWater(0); // Expected: "solid"
    String phaseOfWaterResult4 = phaseOfWater(-11); // Expected: "solid"

    int maxProductResult1 = maxProduct(1, 2, 3); // Expected: 3
    int maxProductResult2 = maxProduct(-3,-7,9); // Expected: 21
    int maxProductResult3 = maxProduct(1, -4, -5); // Expected: 20

    double pipeVolumeResult1 = pipeVolume(16.0, 17.2, 500.0); // Expected: 62580.5256...
    double pipeVolumeResult2 = pipeVolume(12.0, 21.0, 53.6); // Expected: 50011.6417...
    double pipeVolumeResult3 = pipeVolume(1, 2, 3); // Expected: 28.2743...
}

