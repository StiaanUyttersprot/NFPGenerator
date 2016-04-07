import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stiaan
 */
public class OrbitMain {

	private static final String Terashima1 = "testsets\\Terashima1Polygons\\";
	private static final String Terashima2 = "testsets\\Terashima2Polygons\\";
	private static final String albano = "testsets\\albano\\";
	private static final String blaz = "testsets\\blaz\\";
	private static final String dagli = "testsets\\dagli\\";
	private static final String dighe1 = "testsets\\dighe1\\";
	private static final String dighe2 = "testsets\\dighe2\\";
	private static final String fu = "testsets\\fu\\";
	private static final String han = "testsets\\han\\";
	private static final String jakobs1 = "testsets\\jakobs1\\";
	private static final String jakobs2 = "testsets\\jakobs2\\";
	private static final String mao = "testsets\\mao\\";
	private static final String marques = "testsets\\marques\\";
	private static final String polygons_20 = "testsets\\polygons_20\\";
	private static final String polygons_50 = "testsets\\polygons_50\\";
	private static final String polygons_100 = "testsets\\polygons_100\\";
	private static final String polygons_200 = "testsets\\polygons_200\\";
	private static final String polygons_500 = "testsets\\polygons_500\\";
	private static final String polygons_1000 = "testsets\\polygons_1000\\";
	private static final String shapes0 = "testsets\\shapes0\\";
	private static final String shapes1 = "testsets\\shapes1\\";
	private static final String swim = "testsets\\swim\\";
	private static final String shirts = "testsets\\shirts_2007-05-15\\";	
	
	/**
	 * @param args
	 *            the command line arguments
	 * @throws java.io.FileNotFoundException
	 */
	
	
	public static void main(String[] args) throws FileNotFoundException {

		DrawJavaFX drawTool = new DrawJavaFX();

		
		System.out.println("Orbiting tests");
		
		
		File convex1Data = new File("Convex1.txt");
		File convex2Data = new File("Convex2.txt");

		File concave1Data = new File("Concave1.txt");
		File concave2Data = new File("Concave2.txt");
		
		File rectangle1Data = new File("Rectangle1.txt");
		File block1Data = new File("Block1.txt");
		File block2Data = new File("Block2.txt");
		
		File puzzle1Data = new File("Puzzle4.txt");
		File puzzle2Data = new File("Puzzle2.txt");
		File puzzle3Data = new File("Puzzle3.txt");
		
		File sawtooth1Data = new File("Sawtooth1.txt");
		File sawtooth2Data = new File("Sawtooth2.txt");
		
		File clockwiseData = new File("clockwise.txt");
		
		File interlockingConc1Data = new File("interCav1.txt");
		File triangleData = new File("triangle1.txt");

		File interlockingConc2Data = new File("interCav2.txt");
		File interlockingConc3Data = new File("interCav3.txt");
		
		File holes1Data = new File("Holes1.txt");
		File holes2Data = new File("Holes2.txt");
		
		File mink1Data = new File("Mink1.txt");
		File mink2Data = new File("Mink2.txt");
		
		File simple1Data = new File("SimpleFig1.txt");
		File simple2Data = new File("SimpleFig2.txt");
		
		File jigsaw1Data = new File("Jigsaw1.txt");
		File jigsaw2Data = new File("Jigsaw2.txt");
		
		
		File folder = new File(Terashima1);
		File[] listOfFilesT1 = folder.listFiles();
		
		folder = new File(Terashima2);
		File[] listOfFilesT2 = folder.listFiles();
		
		folder = new File(albano);
		File[] albano = folder.listFiles();
		
		folder = new File(blaz);
		File[] blaz = folder.listFiles();
		
		folder = new File(dagli);
		File[] dagli = folder.listFiles();
		
		folder = new File(dighe1);
		File[] dighe1 = folder.listFiles();
		
		folder = new File(dighe2);
		File[] dighe2 = folder.listFiles();
		
		folder = new File(fu);
		File[] fu = folder.listFiles();
		
		folder = new File(han);
		File[] han = folder.listFiles();
		
		folder = new File(jakobs1);
		File[] jakobs1 = folder.listFiles();
		
		folder = new File(jakobs2);
		File[] jakobs2 = folder.listFiles();
		
		folder = new File(mao);
		File[] mao = folder.listFiles();
		
		folder = new File(marques);
		File[] marques = folder.listFiles();
		
		folder = new File(polygons_20);
		File[] polygons_20 = folder.listFiles();
		
		folder = new File(polygons_50);
		File[] polygons_50 = folder.listFiles();
		
		folder = new File(polygons_100);
		File[] polygons_100 = folder.listFiles();
		
		folder = new File(polygons_200);
		File[] polygons_200 = folder.listFiles();
		
		folder = new File(polygons_500);
		File[] polygons_500 = folder.listFiles();
		
		folder = new File(polygons_1000);
		File[] polygons_1000 = folder.listFiles();
		
		folder = new File(shapes0);
		File[] shapes0 = folder.listFiles();
		
		folder = new File(shapes1);
		File[] shapes1 = folder.listFiles();
		
		folder = new File(shirts);
		File[] shirts = folder.listFiles();
		
		folder = new File(swim);
		File[] swim = folder.listFiles();

		System.out.println("Terashima1");
		System.out.println("---------------");
		generateNFPsForList(listOfFilesT1, 1);
		
		System.out.println("Terashima1");
		System.out.println("---------------");
		generateNFPsForList(listOfFilesT1, 1);
		
		System.out.println("Terashima2");
		System.out.println("---------------");
		generateNFPsForList(listOfFilesT2, 1);
		
		System.out.println("albano");
		System.out.println("---------------");
		generateNFPsForList(albano, 4);
		
		System.out.println("blaz");
		System.out.println("---------------");
		generateNFPsForList(blaz, 4);
		
		System.out.println("dagli");
		System.out.println("---------------");
		generateNFPsForList(dagli, 4);
		
		System.out.println("dighe1");
		System.out.println("---------------");
		generateNFPsForList(dighe1, 4);
		
		System.out.println("dighe2");
		System.out.println("---------------");
		generateNFPsForList(dighe2, 4);
		
		System.out.println("fu");
		System.out.println("---------------");
		generateNFPsForList(fu, 4);
		
		System.out.println("han");
		System.out.println("---------------");
		generateNFPsForList(han, 4);
		
		System.out.println("jakobs1");
		System.out.println("---------------");
		generateNFPsForList(jakobs1, 4);
		
		System.out.println("jakobs2");
		System.out.println("---------------");
		generateNFPsForList(jakobs2, 4);
		
		System.out.println("mao");
		System.out.println("---------------");
		generateNFPsForList(mao, 4);
		
		System.out.println("marques");
		System.out.println("---------------");
		generateNFPsForList(marques, 4);
		
		System.out.println("shapes0");
		System.out.println("---------------");
		generateNFPsForList(shapes0, 4);
		
		System.out.println("shapes1");
		System.out.println("---------------");
		generateNFPsForList(shapes1, 4);
		
		System.out.println("shirts");
		System.out.println("---------------");
		generateNFPsForList(shirts, 4);
		
		System.out.println("swim");
		System.out.println("---------------");
		generateNFPsForList(swim, 4);
		

		long startTime;
		long endTime;
		long duration;
		int totalIts = 0;
		

		startTime = System.currentTimeMillis();

//		int i = 0;
//		for(MultiPolygon stat : randomList){
//			int j = 0;
//			
//			for(MultiPolygon orb : randomList){
//				j++;
//				nfpList.add(Orbiting.generateNFP(new MultiPolygon(stat), new MultiPolygon(orb)));
//				totalIts++;
////				System.out.println("["+i+"]["+j+"]");
//			}
//			i++;
//		}
//		
		boolean specialTestSet = false;
		if(specialTestSet){
			MultiPolygon testPoly = new MultiPolygon(concave1Data);
			testPoly.replaceByNegative();
			testPoly.shiftNinety();
			Orbiting.generateNFP(testPoly, new MultiPolygon(concave2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(concave1Data), new MultiPolygon(concave2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(rectangle1Data), new MultiPolygon(rectangle1Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(puzzle1Data), new MultiPolygon(puzzle2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(puzzle3Data), new MultiPolygon(block1Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(sawtooth1Data), new MultiPolygon(sawtooth2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(interlockingConc1Data), new MultiPolygon(triangleData));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(triangleData), new MultiPolygon(interlockingConc2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(triangleData), new MultiPolygon(interlockingConc3Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(holes1Data), new MultiPolygon(triangleData));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(holes1Data), new MultiPolygon(holes2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(interlockingConc3Data), new MultiPolygon(interlockingConc2Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(interlockingConc2Data), new MultiPolygon(interlockingConc3Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(holes1Data), new MultiPolygon(block2Data));
			totalIts++;	
			Orbiting.generateNFP(new MultiPolygon(mink1Data), new MultiPolygon(mink2Data));
			totalIts++;	
			Orbiting.generateNFP(new MultiPolygon(simple2Data), new MultiPolygon(simple1Data));
			totalIts++;
			Orbiting.generateNFP(new MultiPolygon(jigsaw1Data), new MultiPolygon(jigsaw2Data));
			totalIts++;
			
			endTime = System.currentTimeMillis();
			duration = (endTime - startTime);
			System.out.println("current total: " + totalIts);
			System.out.println("fails: " + Orbiting.numberOfFails);
			System.out.println("infinite stuck: " + Orbiting.numberStuckInfinite);		
			System.out.println("duration: " + duration + " ms");
			System.out.println("total itterations: " + totalIts);
			System.out.println(Orbiting.numberOfFails);
			System.out.println(Orbiting.numberStuckInfinite);
			System.out.println(Orbiting.numberOfSecFails);
			
			Orbiting.numberOfFails = 0;
			Orbiting.numberStuckInfinite = 0;
			Orbiting.numberOfSecFails = 0;
		}
		
			
			//print the nfp's------------------------------------------------------------------------
//			for(NoFitPolygon nfp : nfpList){
//				System.out.println(nfp.toString());
//			}
			
//		}
		// ------------------------------------------------------------------------------------
		// graphical representation
		 
//		 drawTool.launchDrawer(args);
	}

	private static void generateNFPsForList(File[] listOfFiles, int rotations) throws FileNotFoundException {
		int n = 0;
		
		List<MultiPolygon> polygonsList = new ArrayList<>();
		
		int numberOfPolys = 1000;
		MultiPolygon original;
		MultiPolygon inverse;
		MultiPolygon ninety;
		MultiPolygon twoseventy;
		for(File polygon: listOfFiles){
			if(n == numberOfPolys)break;
			switch(rotations){
			case 1:
				polygonsList.add(new MultiPolygon(polygon));
				break;
			case 2:
				original = new MultiPolygon(polygon);
				inverse = new MultiPolygon(polygon);
				inverse.replaceByNegative();
				polygonsList.add(original);
				polygonsList.add(inverse);
				break;
			case 4:
				original = new MultiPolygon(polygon);
				inverse = new MultiPolygon(polygon);
				inverse.replaceByNegative();
				ninety = new MultiPolygon(polygon);
				ninety.shiftNinety();
				twoseventy = new MultiPolygon(polygon);
				twoseventy.shiftNinety();
				polygonsList.add(original);
				polygonsList.add(inverse);
				polygonsList.add(ninety);
				polygonsList.add(twoseventy);
				break;
			default:
				polygonsList.add(new MultiPolygon(polygon));
				break;
			}
			
			n++;
		}
		System.out.println(n);

		long startTime;
		long endTime;
		long duration;

		int totalIts = 0;

		

		startTime = System.currentTimeMillis();
		
		for (MultiPolygon stat : polygonsList) {

			for (MultiPolygon orb : polygonsList) {
//				if(totalIts==288){
					Orbiting.generateNFP(new MultiPolygon(stat), new MultiPolygon(orb));
//				}
				
				totalIts++;
//				System.out.println(totalIts);
			}
			
		}
		endTime = System.currentTimeMillis();
		duration = (endTime - startTime);
		System.out.println("current total: " + totalIts);
		System.out.println("fails: " + Orbiting.numberOfFails);
		System.out.println("infinite stuck: " + Orbiting.numberStuckInfinite);		
		System.out.println("duration: " + duration + " ms");
		System.out.println("total itterations: " + totalIts);
		System.out.println(Orbiting.numberOfFails);
		System.out.println(Orbiting.numberStuckInfinite);
		System.out.println(Orbiting.numberOfSecFails);
		
		Orbiting.numberOfFails = 0;
		Orbiting.numberStuckInfinite = 0;
		Orbiting.numberOfSecFails = 0;
		
		System.out.println();
	}
}
