package virtual_mindspace;

import java.util.Scanner;

public class Minecraft2DBeacon {
	static Scanner scan = new Scanner(System.in);
	static int currentCase = 0;											// Contains the index of checked case

	// CURRENT CASE ATTRIBUTES
	static int totalBlocks = 0;											// Contains the total block of checked case
	static int possibleMaxHeight = 0;									// Possible maximum height a pyramid can have, this decreases after some iterations until a solution is found
	static int caseLength = 0;											// The amount of columns the checked case has

	// CHECKER ATTRIBUTES
	static int indexStart = 0;											// Start of the index of checked case, i.e., the top of the pyramid
	static int rowChecker = 0;											// Checks each possible pyramid by current possible maximum height
	static int rowLimit = 0;											// Limit of the checked row
	static int validator = 0;											// Checks if a pyramid contains enough blocks to be valid

	static int totalCase = scan.nextInt();								// Takes the given total case

	// CREATES AN ARRAY FOR EACH CASE
	static void assignCase(int[][] caseContainer) {

		for (int i = 0; i < totalCase; i++)	{
			caseContainer[i] = new int[scan.nextInt()];					// Creates a new container which size is given by case 'length'
			for (int j = 0; j < caseContainer[i].length; j++) {			// Assigns each length of columns to each case
				caseContainer[i][j] = scan.nextInt();
			}
		}

	}

	// CHECKS FOR A POSSIBLE PYRAMID
	static void checkPossiblePyramid(int[][] caseContainer) {

		while (true) {
			checkPossiblePyramidTop(caseContainer);

			if (validator == possibleMaxHeight)	{						// The maximum height of a pyramid is found when validator is equal to possibleMaxHeight
				validator = 1;
				break;
			}
			else if (rowChecker < rowLimit) {
				rowChecker++;
				continue;
			}

			rowChecker = 0;
			rowLimit += 2;
			possibleMaxHeight--;
			indexStart = possibleMaxHeight - 1;
		}

	}

	// CHECKS IF THE STARTING POINT (THE TOP) OF CHECKED PYRAMID IS SUFFICIENT FOR GIVEN POSSIBLE MAXIMUM HEIGHT
	static void checkPossiblePyramidTop(int[][] caseContainer) {

		if (caseContainer[currentCase][indexStart + rowChecker] >= possibleMaxHeight) {
			checkPyramidContainEnoughBlock(caseContainer, 0);
		}
		else if (caseLength % 2 == 0   &&   rowChecker == rowLimit   &&   caseContainer[currentCase][indexStart + rowChecker + 1] >= possibleMaxHeight) {
			checkPyramidContainEnoughBlock(caseContainer, 1);
		}

	}


	// CHECKS IF CHECKED PYRAMID COLUMNS CONTAIN ENOUGH BLOCK TO CREATE THE PYRAMID
	static void checkPyramidContainEnoughBlock(int[][] caseContainer, int isCaseLengthEven) {

		for (validator = 1; validator < possibleMaxHeight; validator++) {
			if (caseContainer[currentCase][indexStart + rowChecker + isCaseLengthEven - validator] >= possibleMaxHeight - validator   &&   caseContainer[currentCase][indexStart + rowChecker + isCaseLengthEven + validator] >= possibleMaxHeight - validator) {
				continue;
			}
			break;
		}

	}

	// MAIN METHOD
	public static void main(String[] args) {

		int[][] caseContainer = new int[totalCase][]; 					// Creates a container for all cases
		assignCase(caseContainer);

		// FINDS THE SOLUTION FOR EACH CASE
		for (currentCase = 0; currentCase < totalCase; currentCase++, totalBlocks = 0, rowLimit = 0, rowChecker = 0) {
			// CALCULATING CHECKED CASE ATTRIBUTES
			for (int columns: caseContainer[currentCase]) {
				totalBlocks += columns;
			}

			caseLength = caseContainer[currentCase].length;
			possibleMaxHeight = ((caseLength + 1) / 2);					// finds the middle column (possible maximum height) of the pyramid in checked case
			indexStart = possibleMaxHeight - 1;							// creates the data index to check

			checkPossiblePyramid(caseContainer);
			System.out.println(totalBlocks - possibleMaxHeight*possibleMaxHeight);
		}

	}
}
