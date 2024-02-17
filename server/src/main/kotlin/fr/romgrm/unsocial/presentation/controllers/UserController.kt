// Sert à faire le lien entre notre route et la logique métier d'un useCase.
// Par exemple : getUser() => userUseCase.getUser() => renvoie d'un user.
// Après cet user on peut faire d'autre logique métier dessus, c'est un peu l'équivalent d'un Service.
// Le fait de séparer Controller/Usecase permet que le controller va pourvoir faire différentes business logic afin
// de renvoyer un user en bonne et due forme au front et le useCase lui fera qu'une chose, getUser
