# Selection sort 
Selection sort sorteert een rij aan de hand van de volgende methode:

Het zoekt in de ongesorteerde rij naar het kleinste element. Wanneer het kleinste element gevonden is verplaast men dit kleinste element naar de eerste positie van de ongesorteerde rij. De ongesorteerde rij wordt nu verkleint. 
Voorbeeld: 
| 2 | 4 | 3 | 1 |
Heel de rij is ongesorteerd. De ganse rij wordt overlopen en één komt uit als het kleinste element.
Het kleinste element wordt vervolgens gewisseld met het eerste element van de ongesorteerde rij.
| 1 | 4 | 3 | 2 |

De ongesorteerde rij wordt nu verkleint. Ze bestaat enkel nog maar uit de laatste drie elementen.
De gesorteerde rij is logischer wijs ook vergroot. Die rij bestaat nu uit het eerste element. Dit wordt telke malen herhaald tot wanneer de hele rij is gesorteerd.

## Best case = worst Case
Bij selection sort kan men niet echt spreken van een best of een worst case. Ieder element (van de ongesorteerde rij)  wordt immers vergeleken met elk ander element van de ongesorteerde rij. 
Het eerste element zal dus N-1 vergelijkingen maken. (Met N de lengte van de rij.) Het tweede N-2, ... Zo komen we aan de som (N-1) + (N-2) + ... + 1. Dit is gelijk aan N*(N-1)/2.  



# Insertion sort
Insertion sort is een sorteeralgorithme dat een rij sorteert aan de hand van de volgende werkwijze.

Men vergelijkt het element van de rij met het  voorgaande element. Indien het voorgaande element kleinder is als het element dat men wil sorteren, dan laat men het element op dezelfde plaats staan. Indien het voorgaande element groter is dan het element dat men wil sorteren, dan verwisselt men beide elementen van plaats. Dit doet men totdat het element dat men wil sorteren geen elementen voor zich heeft dat groter is. Dit doet men voor alle elementen van de rij. Op het einde zal men merken dat de volledige rij gesorteerd is. 

## best case
Het best case scenario voor insertion sort is een rij dat reeds volledig gesorteerd is. Het aantal compares zal dan gelijk zijn aan de lengte van de rij - 1. Ieder element (buiten het eerste) zal immers enkel maar vergeleken worden met zijn voorganger..

| 1 | 2 | 3 | 4 |
## worst case
Het worst case scenario voor insertion sort is een rij dat achterstevoren is gesorteerd. Ieder element zal dan moeten worden vergeleken met de reeds gesorteerde rij.

| 4 | 3 | 2 | 1 |

Drie zal worden vergeleken met vier en daarna worden gewisseld met vier.

| 3 | 4 | 2 | 1 |
twee zal worden vergeleken met vier en daarna met drie. vier wordt verwisseld met twee en drie wordt ook verwisseld met de 2.

| 3 | 2 | 4 | 1 |

| 2 | 3 | 4 | 1 |

Hieruit kunnen we afleiden dat de het aantal vergelijkingen dat dit sorteeralgorithme maakt in zijn worst case gelijk is aan 1 + 2 + ... + (n-1). Wiskundig gezien is dit gelijk aan n*(n-1)/2 waarbij n staat voor de lengte van de rij.

