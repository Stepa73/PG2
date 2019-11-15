
function datumCas(){
                   var nyni = new Date();
	var den = nyni.getDate();
	var mesic = nyni.getMonth()+1; //mesice to počítá od nuly
	var rok = nyni.getFullYear();
	var minuty = nyni.getMinutes();
	var hodiny = nyni.getHours();
	var sekundy = nyni.getSeconds();
                   var denTydne = nyni.getDay(); //0 - neděle, 1 - pondělí .... 6 - sobota
                   
                   var tyden= new Array("neděle ","pondělí ","úterý ","středa ","čtvrtek ","pátek","sobota");
                   var mesice = new Array("","Leden","Únor","Březen","Duben","Květen","Červen","Červenec","Srpen","Září","Říjen","Listopad","Prosinec");
                   
                   var test = tyden[denTydne];
                   var mesicSlovne = mesice[mesic];
                   
                    if(sekundy<10){
                        sekundy="0"+minuty;
                        
                    }
                     if(minuty<10){
                         minuty="0"+minuty;
                        
                    }
                    if(hodiny<10){
                        hodiny="0"+hodiny;
                        
                    }
	
		//document.getElementById("datumCas").innerHTML= den+".&nbsp"+mesic+".&nbsp"+rok+" "+hodiny+":"+minuty+":"+sekundy;
                    document.getElementsByTagName("footer")[0].innerHTML= den+".&nbsp"+mesic+".&nbsp"+rok+" "+hodiny+":"+minuty+":"+sekundy+" "+test+""+mesicSlovne;	
}
       
   
       
    function beziciCas(){
            datumCas();                                     //okamžité spuštění
            setInterval("datumCas()", 1000);    // opakovaně spouští funkci za jednu sekundu
        }

