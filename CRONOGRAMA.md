# Cronograma de Estudos - Desenvolvedor Web Java Jr (5 Meses)
*⚡ VERSÃO ACELERADA - Para quem já domina Java Básico*

## 📅 MÊS 1 - ORIENTAÇÃO A OBJETOS AVANÇADO ✅ VOCÊ ESTÁ AQUI
**Carga: 22h/semana**

### ✅ Semana 1-2: Java Básico (CONCLUÍDO)
- [x] Sintaxe básica, variáveis, tipos de dados
- [x] Estruturas condicionais e loops
- [x] Métodos e parâmetros
- [x] **Projeto:** Calculadora simples via console

### Semana 3 (ATUAL): Herança e Polimorfismo
- [ ] Conceito de herança (extends, super)
- [ ] Polimorfismo e sobrescrita de métodos
- [ ] Classes abstratas
- [ ] Modificador protected
- [ ] **Projeto:** Refatorar calculadora com herança
  - [ ] Criar classe CalculadoraBasica
  - [ ] Criar classe CalculadoraCientifica extends CalculadoraBasica
  - [ ] Implementar potencia(), raizQuadrada()
  - [ ] Sobrescrever divisao() para retornar double
  - [ ] Testar polimorfismo no Main

### Semana 4: Interfaces e Encapsulamento Avançado
- [ ] Interfaces e implementação múltipla
- [ ] Diferença entre interface e classe abstrata
- [ ] Modificadores de acesso avançados (private, protected, public)
- [ ] Getters/Setters e padrão JavaBeans
- [ ] **Projeto:** Sistema de biblioteca com interfaces
  - [ ] Interface Emprestavel com métodos emprestar(), devolver()
  - [ ] Interface Catalogavel com métodos listar(), buscar()
  - [ ] Classe Livro implementando ambas interfaces
  - [ ] Classe Biblioteca gerenciando coleção de livros
  - [ ] Main demonstrando funcionalidades

**Recursos para estudar:**
- [ ] Oracle Java Tutorials (seção OOP)
- [ ] Effective Java - Joshua Bloch (caps. 4-5)

---

## 📅 MÊS 2 - COLLECTIONS E JAVA AVANÇADO
**Carga: 24h/semana**

### Semana 1: Collections Framework
- [ ] ArrayList vs LinkedList (performance)
- [ ] HashMap vs HashSet vs TreeMap vs TreeSet
- [ ] Interfaces Collection, List, Set, Map
- [ ] Comparator e Comparable para ordenação
- [ ] Iteração com for-each e Iterator
- [ ] **Projeto:** Sistema de e-commerce básico
  - [ ] Classe Produto com equals() e hashCode()
  - [ ] Classe Cliente com Comparable (ordenar por nome)
  - [ ] Classe Pedido com List<Produto>
  - [ ] Sistema gerenciando com HashMap<Integer, Cliente>
  - [ ] Relatórios com ordenação customizada

### Semana 2: Tratamento de Exceções e I/O
- [ ] Try-catch-finally, throws
- [ ] Exceções checked vs unchecked
- [ ] Criar exceções customizadas
- [ ] Manipulação de arquivos (Files, Path, BufferedReader)
- [ ] Serialização básica
- [ ] **Projeto:** Sistema de logs com exceções
  - [ ] Classe LogException customizada
  - [ ] Salvar logs em arquivo
  - [ ] Ler e processar logs existentes
  - [ ] Tratamento robusto de erros I/O

### Semana 3: Java 8+ Features - Streams API
- [ ] Lambda expressions básicas
- [ ] Method references (::)
- [ ] Stream.of(), collection.stream()
- [ ] Operações intermediárias: filter(), map(), sorted()
- [ ] Operações terminais: collect(), forEach(), reduce()
- [ ] Collectors.toList(), groupingBy(), summingInt()

### Semana 4: Java 8+ Features - Optional e Datas
- [ ] Optional.of(), Optional.empty(), orElse()
- [ ] LocalDate, LocalDateTime, LocalTime
- [ ] DateTimeFormatter para parsing/formatação
- [ ] **Projeto:** Analisador de vendas com Streams
  - [ ] Ler arquivo CSV de vendas
  - [ ] Processar dados com Streams
  - [ ] Gerar relatórios: vendas por mês, top produtos
  - [ ] Usar Optional para tratamento de nulls

**Recursos para estudar:**
- [ ] Java 8 in Action (caps. 3-6)
- [ ] Exercícios no HackerRank/LeetCode (nível médio)

---

## 📅 MÊS 3 - SPRING BOOT E REST APIs
**Carga: 26h/semana**

### Semana 1: Spring Boot Fundamentos
- [ ] Configurar ambiente: Java 17+, Maven, IDE
- [ ] Spring Initializr - criar projeto base
- [ ] Estrutura de pastas padrão Spring
- [ ] Annotations básicas: @SpringBootApplication, @Component
- [ ] Injeção de dependência: @Autowired, @Service
- [ ] Application.properties vs yml
- [ ] Profiles (dev, prod, test)
- [ ] **Projeto:** Hello World API
  - [ ] Criar controller com GET /hello
  - [ ] Service com lógica de negócio
  - [ ] Diferentes respostas por profile
  - [ ] Logs configurados

### Semana 2: Spring Web (REST APIs)
- [ ] @RestController vs @Controller
- [ ] Mapeamentos: @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
- [ ] @RequestBody, @ResponseEntity, @PathVariable, @RequestParam
- [ ] Status HTTP apropriados (200, 201, 404, 400, 500)
- [ ] Validações: @Valid, @NotNull, @NotBlank, @Size
- [ ] **Projeto:** API de gerenciamento de tarefas
  - [ ] Entity Task (id, titulo, descricao, concluida, dataVencimento)
  - [ ] CRUD completo: listar, criar, atualizar, deletar
  - [ ] Validações em todos endpoints
  - [ ] Tratamento de erros com @ControllerAdvice

### Semana 3: Spring Data JPA
- [ ] Configurar JPA/Hibernate no Spring Boot
- [ ] @Entity, @Id, @GeneratedValue, @Column
- [ ] Relacionamentos: @OneToMany, @ManyToOne, @JoinColumn
- [ ] Repository: extends JpaRepository<Entity, ID>
- [ ] Query Methods: findByNome, findByIdadeGreaterThan
- [ ] @Query para JPQL customizadas
- [ ] **Projeto:** Conectar API tarefas ao H2
  - [ ] Configurar H2 database
  - [ ] Converter Task para @Entity
  - [ ] TaskRepository com query methods
  - [ ] Testar via H2 Console
  - [ ] Data.sql para dados iniciais

### Semana 4: Banco de Dados Real
- [ ] Instalar e configurar PostgreSQL
- [ ] Configurar Spring Boot para PostgreSQL
- [ ] SQL avançado: JOINs, índices, views
- [ ] Flyway para migrations
- [ ] Connection pooling básico
- [ ] **Projeto:** Migrar para PostgreSQL
  - [ ] Scripts de migração com Flyway
  - [ ] Dados de exemplo via migration
  - [ ] Performance tuning básico
  - [ ] Backup e restore básico

**Recursos para estudar:**
- [ ] Spring.io Guides (Getting Started)
- [ ] Spring Boot Reference Documentation
- [ ] Baeldung Spring tutorials

---

## 📅 MÊS 4 - SEGURANÇA, TESTES E FRONTEND
**Carga: 26h/semana**

### Semana 1: Spring Security - Autenticação
- [ ] Adicionar Spring Security dependency
- [ ] Configuração básica de segurança
- [ ] UserDetails e UserDetailsService
- [ ] PasswordEncoder (BCrypt)
- [ ] Autenticação em memória vs banco
- [ ] **Projeto:** Sistema de usuários
  - [ ] Entity User (username, password, roles)
  - [ ] UserRepository e UserService
  - [ ] Endpoints de registro e login
  - [ ] Hash de senhas com BCrypt

### Semana 2: Spring Security - JWT e Autorização
- [ ] JWT: conceitos e estrutura
- [ ] Gerar e validar JWT tokens
- [ ] @PreAuthorize, @Secured
- [ ] Roles vs Authorities
- [ ] CORS configuration
- [ ] **Projeto:** JWT completo na API tarefas
  - [ ] Login retornando JWT token
  - [ ] Middleware de validação JWT
  - [ ] Autorização: ADMIN pode deletar, USER só criar/editar próprias
  - [ ] Configurar CORS para frontend

### Semana 3: Testes Automatizados
- [ ] JUnit 5: @Test, @BeforeEach, @AfterEach
- [ ] Assertions: assertEquals, assertNotNull, assertThrows
- [ ] Mockito: @Mock, @InjectMocks, when().thenReturn()
- [ ] @SpringBootTest para testes de integração
- [ ] TestContainers para testes com banco real
- [ ] **Projeto:** Cobertura de testes 70%+
  - [ ] Testes unitários para Services
  - [ ] Testes de integração para Controllers
  - [ ] Mocks para dependencies externas
  - [ ] Relatório de cobertura

### Semana 4: Frontend Essencial
- [ ] HTML semântico (header, main, section, article)
- [ ] CSS moderno: Flexbox, Grid, responsivo
- [ ] JavaScript ES6+: const/let, arrow functions, async/await
- [ ] Fetch API para consumir REST APIs
- [ ] Manipulação DOM: querySelector, addEventListener
- [ ] **Projeto:** Interface web para API tarefas
  - [ ] Página de login com JWT
  - [ ] Dashboard listando tarefas
  - [ ] Formulário criar/editar tarefa
  - [ ] Responsive design
  - [ ] Tratamento de erros de API

**Recursos para estudar:**
- [ ] Spring Security Reference
- [ ] JUnit 5 User Guide
- [ ] MDN Web Docs (JavaScript)

---

## 📅 MÊS 5 - PROJETO FINAL E PREPARAÇÃO PROFISSIONAL
**Carga: 30h/semana**

### Semana 1: Arquitetura do Projeto Final
- [ ] Definir escopo: Sistema de E-commerce ou ERP
- [ ] Modelagem de dados (3+ entidades relacionadas)
- [ ] Arquitetura em camadas (Controller, Service, Repository)
- [ ] Configuração inicial com todas dependências
- [ ] **Planejamento:**
  - [ ] Escolher domínio (e-commerce, biblioteca, clinica, etc.)
  - [ ] Desenhar ERD no papel
  - [ ] Criar estrutura inicial Spring Boot
  - [ ] Configurar Git com commits organizados

### Semana 2: Backend Completo
- [ ] Implementar todas entities com relacionamentos
- [ ] CRUD completo para cada entidade
- [ ] Validações robustas e tratamento de exceções
- [ ] Documentação API com Swagger/OpenAPI
- [ ] **Desenvolvimento:**
  - [ ] Pelo menos 3 entities relacionadas
  - [ ] Business rules implementadas
  - [ ] Exception handling global
  - [ ] API documentation completa

### Semana 3: Segurança e Testes
- [ ] Sistema de autenticação JWT completo
- [ ] Autorização por roles granular
- [ ] Testes unitários (70%+ cobertura)
- [ ] Testes de integração end-to-end
- [ ] **Qualidade:**
  - [ ] Login/logout funcionando
  - [ ] Diferentes níveis de permissão
  - [ ] Test suite completa
  - [ ] Code review próprio

### Semana 4: Deploy e Preparação Profissional
- [ ] Deploy backend no Railway/Render
- [ ] Configurar banco PostgreSQL em produção
- [ ] Docker básico (Dockerfile)
- [ ] CI/CD básico com GitHub Actions
- [ ] **Preparação para mercado:**
  - [ ] README profissional com screenshots
  - [ ] Currículo focado em projetos
  - [ ] LinkedIn otimizado
  - [ ] Portfolio GitHub organizado
  - [ ] 10 exercícios algoritmos (LeetCode/HackerRank)

**Recursos para estudar:**
- [ ] Clean Code - Robert Martin
- [ ] Cracking the Coding Interview
- [ ] Guias de entrevista técnica

---

## 🛠️ FERRAMENTAS ESSENCIAIS - CHECKLIST SETUP

### IDEs e Editores
- [ ] IntelliJ IDEA Community instalado
- [ ] VS Code instalado (para frontend)
- [ ] Extensões úteis configuradas

### Ambiente Java
- [ ] Java 17+ instalado (verificar com java -version)
- [ ] Maven instalado e configurado
- [ ] JAVA_HOME configurado

### Controle de Versão
- [ ] Git instalado e configurado (user.name, user.email)
- [ ] GitHub account criado
- [ ] SSH keys configuradas

### Banco de Dados
- [ ] PostgreSQL instalado
- [ ] pgAdmin ou DBeaver instalado
- [ ] H2 database (vem com Spring Boot)

### Ferramentas de Teste
- [ ] Postman instalado
- [ ] Insomnia (alternativa ao Postman)

### Outros
- [ ] Docker Desktop (para mês 5)
- [ ] Node.js (para algumas ferramentas frontend)

---

## 📚 CRONOGRAMA DE LEITURA - PROGRESSO

### Mês 1: Effective Java - Joshua Bloch
- [ ] Cap. 2: Creating and Destroying Objects
- [ ] Cap. 3: Methods Common to All Objects
- [ ] Cap. 4: Classes and Interfaces
- [ ] Cap. 5: Generics
- [ ] Cap. 6: Enums and Annotations

### Mês 2: Java 8 in Action
- [ ] Cap. 3: Lambda expressions
- [ ] Cap. 4: Introducing streams
- [ ] Cap. 5: Working with streams
- [ ] Cap. 6: Collecting data with streams
- [ ] Cap. 7: Parallel data processing and performance
- [ ] Cap. 8: Collection API enhancements

### Mês 3: Spring Boot in Action
- [ ] Cap. 1: Bootstarting Spring
- [ ] Cap. 2: Developing your first Spring Boot application
- [ ] Cap. 3: Customizing configuration
- [ ] Cap. 4: Testing with Spring Boot
- [ ] Cap. 5: Getting Groovy with the Spring Boot CLI
- [ ] Cap. 6: Applying Grails in Spring Boot

### Mês 4: Spring Security in Action
- [ ] Cap. 1: Security Today
- [ ] Cap. 2: Hello Spring Security
- [ ] Cap. 3: Managing users
- [ ] Cap. 4: Dealing with passwords

### Mês 5: Clean Code - Robert Martin
- [ ] Cap. 1: Clean Code
- [ ] Cap. 2: Meaningful Names
- [ ] Cap. 3: Functions
- [ ] Cap. 4: Comments
- [ ] Cap. 5: Formatting
- [ ] Cap. 6: Objects and Data Structures
- [ ] Cap. 7: Error Handling
- [ ] Cap. 8: Boundaries

---

## 🎯 METAS SEMANAIS - TRACKING

### Semana Atual: ___/___
- [ ] 3-4 commits no GitHub
- [ ] 1 projeto prático completo
- [ ] Revisão ativa dos conceitos anteriores
- [ ] 4 exercícios de algoritmos
- [ ] README atualizado para projeto atual
- [ ] Capítulo(s) de livro lido(s)

### Avaliação Mensal - Checklist
- [ ] **Mês 1:** Posso criar aplicações OO robustas com herança e polimorfismo?
- [ ] **Mês 2:** Consigo manipular dados complexos com Streams e Collections?
- [ ] **Mês 3:** Desenvolvo APIs REST completas conectadas a banco?
- [ ] **Mês 4:** Implemento segurança robusta e crio interfaces web funcionais?
- [ ] **Mês 5:** Tenho um portfolio completo que impressiona recrutadores?

---

## 🚀 PORTFOLIO PROGRESS - PROJETOS COMPLETOS

- [ ] **Projeto 1:** Calculadora com Herança (Mês 1)
- [ ] **Projeto 2:** Sistema Biblioteca com Interfaces (Mês 1)  
- [ ] **Projeto 3:** E-commerce com Collections (Mês 2)
- [ ] **Projeto 4:** Analisador de Vendas com Streams (Mês 2)
- [ ] **Projeto 5:** API Tarefas com Spring Boot (Mês 3)
- [ ] **Projeto 6:** API com JWT + Frontend (Mês 4)
- [ ] **Projeto 7:** Sistema Completo Final (Mês 5)

**Status Portfolio GitHub:**
- [ ] Todos projetos commitados
- [ ] READMEs profissionais
- [ ] Screenshots/GIFs demonstrativos
- [ ] Código bem documentado
- [ ] Deploy links funcionando

---

## 💼 PREPARAÇÃO MERCADO - CHECKLIST FINAL

### GitHub Portfolio
- [ ] Profile README atrativo
- [ ] Repositórios organizados
- [ ] Commits consistentes (green squares)
- [ ] Projetos com documentation
- [ ] Pin dos melhores repositórios

### LinkedIn
- [ ] Perfil completo e profissional
- [ ] Experiências e projetos adicionados
- [ ] Conexões com devs da área
- [ ] Posts sobre aprendizado
- [ ] Recomendações solicitadas

### Currículo
- [ ] Focado em projetos e tecnologias
- [ ] Seção de projetos detalhada
- [ ] Skills técnicas organizadas
- [ ] Formato PDF profissional
- [ ] Versão em inglês

### Preparação Técnica
- [ ] 50+ exercícios algoritmos resolvidos
- [ ] Simulação de entrevistas técnicas
- [ ] Perguntas comportamentais preparadas
- [ ] Explicar projetos em 5 minutos
- [ ] Conhecer bem todo stack usado

---

## 📞 COMUNIDADES E NETWORKING

### Discord/Telegram - Participação Ativa
- [ ] He4rt Developers (Discord)
- [ ] Java Brasil (Telegram)
- [ ] Spring Developers (Discord)
- [ ] Grupo local da sua cidade

### Eventos e Networking
- [ ] Meetups locais Java/Spring
- [ ] Webinars sobre tecnologia
- [ ] Conferências online (DevConf, etc.)
- [ ] Code challenges/hackathons

### Contribuição Open Source (Opcional)
- [ ] Contribuir para projeto pequeno
- [ ] Reportar bugs encontrados
- [ ] Melhorar documentação
- [ ] Criar biblioteca útil

---

## 📊 DASHBOARD PESSOAL - ACOMPANHAMENTO

### Estatísticas Mensais
**Mês 1:**
- Horas estudadas: ___/88h
- Commits GitHub: ___
- Projetos finalizados: ___/2
- Capítulos lidos: ___/5

**Mês 2:**
- Horas estudadas: ___/96h  
- Commits GitHub: ___
- Projetos finalizados: ___/2
- Exercícios algoritmos: ___

**Mês 3:**
- Horas estudadas: ___/104h
- Commits GitHub: ___
- Projetos finalizados: ___/2
- APIs desenvolvidas: ___

**Mês 4:**
- Horas estudadas: ___/104h
- Commits GitHub: ___
- Projetos finalizados: ___/2
- Cobertura testes: ___%

**Mês 5:**
- Horas estudadas: ___/120h
- Commits GitHub: ___
- Projeto final: ___% completo
- Aplicações enviadas: ___

**TOTAL: ___/512h estudadas em 5 meses**
