# TD4

## Tête d'aggrégat et TDA

La classe `ShowService` ne respecte pas le TDA.
1. Modifier cette classe et celles du domaine afin de respecter le TDA.

Suite à vos modifications, tous les attributs de classes doivent être **privés**.

2. Vous verrez apparaitre une tête d'agrégat. Quelle est-elle?
Assurez-vous que toutes les interactions externes passent par la tête d'aggrégat.

3. Ajouter les tests unitaires.

## ISP

L'interface `Imprimante` est implémentée par deux classes:
- `ImprimanteMultiFonctions`
- `PDFPrinter`
- `VieilleImprimante`

Cette interface est aussi utilisé dans deux classes:
- `DocumentExporter`
- `DocumentReader`

1. Séparer cette interface afin de respecter le ISP.
2. Assurez-vous de nommer les interfaces avec des "capacités".

## SRP

La classe `AssignateurDeSiegeSimple` est en charge de l'assignation des sièges dans un avion.
Cette classe a trop de responsabilités et ne respecte pas le SRP.

1. Identifier les nombreuses responsabilités actuelles de la classe `AssignateurDeSiegeSimple`
2. Identifier la seule responsabilité que devrait avoir la classe `AssignateurDeSiegeSimple`.
3. Corriger la situation.
