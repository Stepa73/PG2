document.querySelector("button").addEventListener('click', date);

function date() {
    console.log(document.forms.formularDatum.datum.values())
}
var ted = new Date();
var den = ted.getDate();
var denVTydnu = ted.getDay();

 var MesicJmeno = ["Leden","Únor","Březen","Duben","Květen","Červen","Červenec","Srpen","Září","Říjen","Listopad", "Prosinec"];

var mesic = ted.getMonth();
var rok = ted.getFullYear();
console.log(ted);

document.write(den);
document.write(MesicJmeno[denVTydnu]);