# Patrons de conception / Ica Ishimwe / dec 2023
# Adaptateur
## Catégorie
Patrons structurels
## Utilité
L'adaptateur est un modèle de conception structurelle qui permet aux objets dotés d'interfaces incompatibles de collaborer.
# Concepts OOP
## Utilisation de l'héritage dans le patron

Des classes comme AudioPlayer, VlcPlayer et Mp4Player implémentent des interfaces ou étendent d'autres classes, héritant de leur comportement ou de leurs obligations contractuelles. Par exemple, AudioPlayer implémente l'interface MediaPlayer, héritant de sa signature de méthode.

## Utilisation d'interfaces dans le patron
Le code définit des interfaces (MediaPlayer et AdvancedMediaPlayer) pour spécifier les méthodes que les classes doivent implémenter. Cela aide à réaliser l’abstraction et à définir des contrats de fonctionnalité
## Utilisation du polymorphisme dans le patron
La classe AudioPlayer utilise un adaptateur (MediaAdapter) qui implémente l'interface MediaPlayer. Cet adaptateur fonctionne sur différents types de lecteurs multimédias (VlcPlayer et Mp4Player) via l'interface AdvancedMediaPlayer. Cette utilisation permet de traiter différentes classes de manière uniforme (via leur interface commune) et permet de basculer entre différentes implémentations pendant l'exécution.
## Utilisation de composition dans le patron
# Sources
tutorials point: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm













