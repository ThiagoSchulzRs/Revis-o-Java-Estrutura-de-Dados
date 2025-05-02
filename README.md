# Exercício de Java: Herança, Abstração, Interfaces e Princípios SOLID

## 🎯 Objetivo

Este projeto tem como objetivo ajudar os alunos a entenderem melhor a sintaxe do Java e os conceitos de:
- Herança e abstração
- Interfaces e polimorfismo
- Princípios SOLID:
- Single Responsibility Principle: Cada classe tem uma única responsabilidade.
- Open/Closed Principle: Podemos adicionar novos dispositivos sem alterar as classes existentes.
---

## 🧱 Requisitos

### ✅ Classe abstrata `Dispositivo`

- Atributos comuns:
  - `id`
  - `nome`
  - `ligado`
- Método abstrato:
  - `executarAcao()` (cada dispositivo realiza uma ação diferente)

---

### ✅ Subclasses de `Dispositivo`

1. **Lampada**
   - Ação: Acender/Apagar luz

2. **SensorTemperatura**
   - Ação: Medir temperatura

---

### ✅ Interface `Conectavel`

- Métodos:
  - `conectar()`
  - `desconectar()`

> Todas as subclasses devem implementar essa interface.

---

### ✅ Classe de serviço `DispositivoService`

Métodos:

- `ligarDispositivo(Dispositivo d)`
- `desligarDispositivo(Dispositivo d)`
- `executarAcao(Dispositivo d)`

---

### ✅ Aplicação principal (`Main`)

- Criar instâncias de dispositivos
- Conectar os dispositivos
- Executar ações
- Desconectar os dispositivos
