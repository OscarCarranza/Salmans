
package salmans;

import java.util.ArrayList;

public class Grafo {
   ArrayList <Nodo> grafo = new ArrayList();
   protected String journeys = "";

    public Grafo() {
    }
   
   public void addPlanet(Nodo p){
       grafo.add(p);
   }
   
   public Nodo getNodoIn(int i){
       return grafo.get(i);
   }
   
   public void removeNodoIn(int i){
       grafo.remove(i);
   }
   
   public ArrayList <Nodo> getPlanets(){
       return grafo;
   }
   
   public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }
    
    
    public void removeRoutesOf(Nodo p1){
        for(int i = 0; i < routes.size(); i++){
            if(p1.getName().equals(routes.get(i).getNodo1().getName()) || p1.getName().equals(routes.get(i).getNodo2().getName())){
                routes.remove(i);
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    
    public void addRoute(Nodo start, Nodo destiny, int distance){
        Route newPath = new Route(start,destiny,distance);
        routes.add(newPath);
    }
    
    public int Floyd(int pesoTot,Nodo origen, Nodo destino){
        journeys += a.toString();
        journeys += "-->";
        int menor_peso = 0;
        ArrayList <Route> paths = this.getRoutes();
        int cont = 0, temp = 0, contTemp = 0;
        Nodo dest = b;
        for(int i = 0; i < paths.size(); i++){
            if(paths.get(i).getNodo1() == a || paths.get(i).getNodo2() == a){
                cont++;
                int p = paths.get(i).getPeso(); 
                if(cont == 2){
                    menor_peso = Math.min(p, temp);
                    if(p == menor_peso && paths.get(i).getNodo1() == a){
                        dest = paths.get(i).getNodo2();
                    }
                    else if(p == menor_peso && paths.get(i).getNodo2() == a){
                        dest = paths.get(i).getNodo1();
                    }
                    else if(temp == menor_peso && paths.get(contTemp).getNodo1() == a){
                        dest = paths.get(contTemp).getNodo2();
                    }
                    else if(temp == menor_peso && paths.get(contTemp).getNodo2() == a){
                        dest = paths.get(contTemp).getNodo1();
                    cont = 0;
                }
                contTemp = i;
                temp = p;
            }
            contTemp++;
        }
        System.out.println("Destino final: " + b + "Planeta donde se movio: " + dest);
        pesoTot+=menor_peso;
        
        if(dest.getName().equals(b.getName())){
             journeys += b.toString();
             journeys += "     Time: " + pesoTot;
             journeys += "\n";
             return pesoTot;
             
         }
         else{
             return Travel(pesoTot,dest,b);
         }
    }
    return pesoTot;
    
}
}