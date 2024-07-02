package com.eleodoro;

import java.util.ArrayList;

import com.eleodoro.modelo.Funcionario;

public class App 
{
    public static void main( String[] args )
    {
        Connection conexao = new Conexao().getConnection();
        FuncionarioDao funcionarioDao = new FuncionarioDao(conexao);

        Funcionario funcionarioInsert = new Funcionario("testeFuncionarioincluir", "654321");
        Funcionário funcionarioInserida = funcionarioDaoIncluir(funcionarioInsert);

        Funcionario funcionarioSelecionada = funcionarioDao.selectPorId(FuncionarioInserido);

        funcionarioDao.delete(funcionarioSelecionado);

        ArrayList<Funcionario> funcionario = funcionarioDao.selectAll();

        Funcionario funcionarioUpdate = new funcionario(1, "funcionario3");
        Funcionario funcionarioAlterado = funcionarioDaoUpdate(funcionarioUpdate);
    }
}
