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

