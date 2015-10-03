import java.util.ArrayList;
import java.util.List;

public class Orbiting {
    
    public static MultiPolygon generateNFP(MultiPolygon statPoly, MultiPolygon orbPoly){
        
        Coordinate bottomCoord = statPoly.findBottomCoord();
        Coordinate topCoord = orbPoly.findTopCoord();
        
        orbPoly.translate(bottomCoord.getxCoord()-topCoord.getxCoord(), bottomCoord.getyCoord()-topCoord.getyCoord());
        
		//---------------------------------------------------------------------------------------------------------------------
        //detecting touching edges
        List<TouchingEdgePair> touchingEdges = statPoly.findTouchingEdges(orbPoly);
        
        System.out.println("touching edges: " + touchingEdges.size());
        for(TouchingEdgePair tEP:touchingEdges){
        	tEP.print();
        }
        
		//---------------------------------------------------------------------------------------------------------------------
        //create potential translation vectors
        List<Coordinate> potentialVectors = new ArrayList<>();
        Coordinate potVector;
        for(TouchingEdgePair tEP: touchingEdges){
        	potVector = tEP.getPotentialVector();
        	if(potVector != null){
        		potentialVectors.add(potVector);
        	}
        }
        
        System.out.println();
        System.out.println("Potential vectors: " + potentialVectors.size());
        for(Coordinate vect:potentialVectors){
        	vect.printCoordinate();
        }
        

        
        return null;//TODO resultaat hier zetten
    }
}
