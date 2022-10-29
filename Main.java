dto.put(
        "player_shots_detail", 
        playerCrabRepository
        .findAll()
        .stream()
        .map(playerCrab -> playerCrab.getDiceCrabList())
        .flatMap(diceCrab -> makeDiceCrabMiniDto(diceCrab))
        .collect(Collectors.toList())
);
