INSERT INTO `empresa` (`id`, `cnpj`, `data_atualizacao`, `data_criacao`, `razao_social`) 
VALUES (NULL, '123', CURRENT_DATE(), CURRENT_DATE(), 'Uni-FACEF');

INSERT INTO `funcionario` (`id`, `nome`, `email`, `senha`, `cpf`, `valorHora`, `qtdHorasTrabalhoDia`, `qtdHorasAlmoco`, `PerfilEnum`,   `data_atualizacao`, `data_criacao`) 
VALUES (NULL, 'Maju', 'mariajulia@gmail.com', '123mudar', '132.456.789.01', 200.00, 8.00, 1.00, 'I don't Know',  'CURRENT_DATE(), CURRENT_DATE());
