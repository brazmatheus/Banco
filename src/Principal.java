
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int deseja = 0;
		boolean boo = true;
		String nome = null;
		String sexo;
		sexo = null;
		int idade = 0;
		String estado;
		String aniv = null;
		int cod;
		double saldo;
		String senha = null;
		boolean exc = true;
		boolean exc2 = true;
		Date d = new Date();
		Calendar cal = new GregorianCalendar();

		ArrayList<ContaCorrente> lcc = new ArrayList();
		ArrayList<ContaPoupanca> lcp = new ArrayList();

		Conta ct = null;
		ContaPoupanca cp = null;
		ContaCorrente cc = null;
		InterfaceExtrato iex = null;
		Extrato ex = null;
		PessoaJuridica pj;
		PessoaFisica pf;

		do {
			String[] options1 = { "CONTA", "SALDO", "SAQUE", "EXTRATO", "TRANSFERENCIA" };
			String[] conta = { "CRIAR CONTA", "EXCLUIR CONTA", "VER CONTA", "EDITAR DADOS" };
			String[] conta2 = { "CONTA CORRENTE", "CONTA POUPANÃ‡A" };
			String[] pessoa = { "PESSOA FISICA", "PESSOA JURIDICA" };
			String[] saque2 = { "50", "100", "SAQUE PERSONALIZADO" };
			String[] transferencia = { "FAZER TRANSFERENCIA" };
			String[] options2 = { "TITULAR", "CONTA" };
			String[] select1 = { "NOME", "SEXO", "IDADE", "ANIVERSÃ�RIO" };
			String[] select2 = { "ESTADO DE RESIDÃŠNCIA DO TITULAR", "SALDO", "LIMITE/OBJETIVO" };

			// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					int resp = JOptionPane.showOptionDialog(null, "Escolha uma Opção", "Menu de opções",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options1, null);

					if (options1[resp].equalsIgnoreCase("CONTA")) {
						int result = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu de opções",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta, null);
						boolean continuar = true;

						if (conta[result].equalsIgnoreCase("CRIAR CONTA")) {
							do {
								try {

									int result1 = JOptionPane.showOptionDialog(null, "Qual tipo de conta deseja criar?",
											"Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
											conta2, null);
									int result2 = JOptionPane.showOptionDialog(null, "O titular é?",
											"Menu de opções", JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.PLAIN_MESSAGE, null, pessoa, null);

									nome = JOptionPane.showInputDialog("Nome do Titular:");
									sexo = JOptionPane.showInputDialog("Sexo do Titular:");
									idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do Titular:"));
									aniv = JOptionPane.showInputDialog("Aniversario do Titular:");

									if (conta2[result1].equalsIgnoreCase("CONTA CORRENTE")) {
										if (pessoa[result2].equalsIgnoreCase("PESSOA FISICA")) {
											String cpf = (JOptionPane.showInputDialog("CPF do Titular fÃ­sico:"));

											pf = new PessoaFisica(nome, sexo, idade, aniv, cpf);

											String estadoconta = JOptionPane
													.showInputDialog("Estado de residência do titular:");
											saldo = Double.parseDouble(
													JOptionPane.showInputDialog("Saldo inicial da conta:"));
											double limite = Double.parseDouble(
													JOptionPane.showInputDialog("Limite de saldo da conta:"));
											senha = JOptionPane.showInputDialog("Senha da conta:");

											cc = new ContaCorrente(pf, estadoconta, saldo, limite, senha);

											String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

											iex = new InterfaceExtrato("+" + String.valueOf(saldo), date);
											ex = new Extrato();
											ex.addEx(iex);

											cc.setExtrato(ex);
											lcc.add(cc);
										}

										if (pessoa[result2].equalsIgnoreCase("PESSOA JURIDICA")) {
											String cpnj = (JOptionPane.showInputDialog("CPNJ do titular Juridico: "));

											pj = new PessoaJuridica(nome, sexo, idade, aniv, cpnj);

											String estadoconta = JOptionPane
													.showInputDialog("Estado de residência do titular: ");
											saldo = Double.parseDouble(
													JOptionPane.showInputDialog("Saldo inicial da conta: "));
											double limite = Double.parseDouble(
													JOptionPane.showInputDialog("Limite de saldo da conta: "));
											senha = JOptionPane.showInputDialog("Senha da conta: ");

											cc = new ContaCorrente(pj, estadoconta, saldo, limite, senha);

											String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

											iex = new InterfaceExtrato("+" + String.valueOf(saldo), date);
											ex = new Extrato();
											ex.addEx(iex);

											cc.setExtrato(ex);
											lcc.add(cc);
										}
									}
									if (conta2[result1].equalsIgnoreCase("CONTA POUPANÇA")) {
										if (pessoa[result2].equalsIgnoreCase("PESSOA FISICA")) {
											String cpf = (JOptionPane.showInputDialog("CPF do Titular fisico"));

											pf = new PessoaFisica(nome, sexo, idade, aniv, cpf);

											String estadoconta = JOptionPane
													.showInputDialog("Estado de residência do Titular");
											saldo = Double
													.parseDouble(JOptionPane.showInputDialog("Saldo inicial da conta"));
											double Objetivo = Double.parseDouble(
													JOptionPane.showInputDialog("Objetivo de arrecadação da conta:"));
											senha = JOptionPane.showInputDialog("Senha da conta:");

											cp = new ContaPoupanca(pf, estadoconta, saldo, Objetivo, senha);

											String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

											iex = new InterfaceExtrato("+" + String.valueOf(saldo), date);
											ex = new Extrato();
											ex.addEx(iex);

											cp.setExtrato(ex);
											lcp.add(cp);
										}

										if (pessoa[result2].equalsIgnoreCase("PESSOA JURIDICA")) {
											String cpnj = (JOptionPane.showInputDialog("CNPJ do titular juridico: "));

											pj = new PessoaJuridica(nome, sexo, idade, aniv, cpnj);

											String estadoconta = JOptionPane
													.showInputDialog("Estado de residência do titular: ");
											saldo = Double.parseDouble(
													JOptionPane.showInputDialog("Saldo inicial da conta: "));
											double limite = Double.parseDouble(
													JOptionPane.showInputDialog("Limite de saldo da conta:"));
											senha = JOptionPane.showInputDialog("Senha da conta: ");

											cp = new ContaPoupanca(pj, estadoconta, saldo, limite, senha);

											String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

											iex = new InterfaceExtrato("+" + String.valueOf(saldo), date);
											ex = new Extrato();
											ex.addEx(iex);

											cp.setExtrato(ex);
											lcp.add(cp);
										}
									}
									continuar = false;
								} catch (NumberFormatException nfe) {
									JOptionPane.showMessageDialog(null, "Não são permitidos números nulos!");
								}
							} while (continuar == true);
						}

						if (conta[result].equalsIgnoreCase("EDITAR DADOS")) {
							int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja modificar", "Tipo",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);
							int x = parseInt(JOptionPane.showInputDialog("CÃ³digo da conta que deseja modificar: "));
							int result1 = JOptionPane.showOptionDialog(null, "Do que você deseja editar os dados?",
									"Menu de Opções", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
									null, options2, null);

							if (options2[result1].equalsIgnoreCase("TITULAR")) {
								int op = JOptionPane.showOptionDialog(null, "Qual dado você quer mudar?", "Menu",
										JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, select1, select1[0]);

								if (select1[op].equalsIgnoreCase("NOME")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										String temp = JOptionPane.showInputDialog("Digite o novo nome: ");
										lcc.get(x-1).titular.setNome(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										String temp = JOptionPane.showInputDialog("Digite o novo nome: ");
										lcp.get(x-1).titular.setNome(temp);
									}
								}
								if (select1[op].equalsIgnoreCase("SEXO")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										String temp = JOptionPane.showInputDialog("Digite o novo sexo: ");
										lcc.get(x-1).titular.setSexo(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										String temp = JOptionPane.showInputDialog("Digite o novo sexo: ");
										lcp.get(x-1).titular.setSexo(temp);
									}
								}
								if (select1[op].equalsIgnoreCase("IDADE")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										int temp = parseInt(JOptionPane.showInputDialog("Digite o novo sexo: "));
										lcc.get(x-1).titular.setIdade(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										int temp = parseInt(JOptionPane.showInputDialog("Digite o novo sexo: "));
										lcp.get(x-1).titular.setIdade(temp);
									}
								}
								if (select1[op].equalsIgnoreCase("ANIVERSÁRIO")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										String temp = JOptionPane.showInputDialog("Digite o novo aniversÃ¡rio: ");
										lcc.get(x-1).titular.setAniv(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										String temp = JOptionPane.showInputDialog("Digite o novo aniversÃ¡rio: ");
										lcp.get(x-1).titular.setAniv(temp);
									}
								}
							}
							if (options2[result1].equalsIgnoreCase("CONTA")) {
								int op = JOptionPane.showOptionDialog(null, "Qual dado você quer mudar?", "Opções",
										JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, select1, select1[0]);

								if (select1[op].equalsIgnoreCase("ESTADO DE RESIDÊNCIA DO TITULAR")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										String temp = JOptionPane.showInputDialog("Digite o novo Estado: ");
										lcc.get(x-1).setEstado(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										String temp = JOptionPane.showInputDialog("Digite o novo Estado: ");
										lcp.get(x-1).setEstado(temp);
									}
								}
								if (select1[op].equalsIgnoreCase("SALDO")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										double temp = parseDouble(JOptionPane.showInputDialog("Digite o novo saldo: "));
										lcc.get(x-1).setSaldo(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										String temp = JOptionPane.showInputDialog("Digite o novo saldo: ");
										lcp.get(x-1).titular.setSexo(temp);
									}
								}
								if (select1[op].equalsIgnoreCase("Limite/Objetivo")) {
									if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
										double temp = parseDouble(
												JOptionPane.showInputDialog("Digite o novo Limite: "));
										lcc.get(x-1).setLimite(temp);
									}
									if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
										double temp = parseDouble(
												JOptionPane.showInputDialog("Digite o novo Objetivo: "));
										lcp.get(x-1).setObjetivo(temp);
									}
								}
							}
						}

						if (conta[result].equalsIgnoreCase("VER CONTA")) {
							int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja ver", "Tipo",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);
							int x = parseInt(JOptionPane.showInputDialog("CÃ³digo da conta que deseja ver: "));

							if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
								if (lcc.get(x - 1) != null) {
									JOptionPane.showMessageDialog(null, lcc.get(x - 1).toString());
								} else {
									JOptionPane.showMessageDialog(null, "Essa conta não existe!");
								}
							} else if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
								if (lcc.get(x - 1) != null) {
									JOptionPane.showMessageDialog(null, lcp.get(x - 1).toString());
								} else {
									JOptionPane.showMessageDialog(null, "Essa conta não existe!");
								}
							}
						}

						if (conta[result].equalsIgnoreCase("EXCLUIR CONTA")) {
							int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja remover", "Tipo",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);
							int x = parseInt(JOptionPane.showInputDialog("Código da conta que deseja remover: "));

							if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
								if (lcc.get(x - 1) != null) {
									lcc.remove(x - 1);
								} else {
									JOptionPane.showMessageDialog(null, "Essa conta não existe!");
								}
							} else if (conta2[y].equalsIgnoreCase("CONTA POUPANÃ‡A")) {
								if (lcc.get(x - 1) != null) {
									lcp.remove(x - 1);
								} else {
									JOptionPane.showMessageDialog(null, "Essa conta não existe!");
								}
							}
						}
					}
					// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					if (options1[resp].equalsIgnoreCase("SALDO")) {
						int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja ver o saldo: ", "Tipo",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);
						int x = parseInt(JOptionPane.showInputDialog("Código da conta que deseja ver o saldo: "));

						do {
							try {
								if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
									if (lcc.get(x - 1).mostraSaldo() != 0) {
										JOptionPane.showMessageDialog(null,
												"Saldo da conta selecionada: " + lcc.get(x - 1).mostraSaldo());
									}
								}
								if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
									if (lcp.get(x - 1).mostraSaldo() != 0) {
										JOptionPane.showMessageDialog(null,
												"Saldo da conta selecionada: " + lcp.get(x - 1).mostraSaldo());
									}
								}
								exc = false;
							} catch (NullPointerException ne) {
								System.out.println("NullPointerException");
							}
						} while (exc != false);
					}
					// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					if (options1[resp].equalsIgnoreCase("SAQUE")) {
						int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja sacar: ", "Tipo",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);
						int x = parseInt(JOptionPane.showInputDialog("CÃ³digo da conta que deseja sacar: "));

						if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
							int result2 = JOptionPane.showOptionDialog(null, "Escolha uma opçãoo", "Menu",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, saque2, null);
							String senhap = null;

							if (saque2[result2].equalsIgnoreCase("50")) {
								senhap = JOptionPane.showInputDialog("Por favor insira a senha da conta: ");
								pedirSenha(lcc.get(x - 1).senhacc, senhap);

								JOptionPane.showMessageDialog(null,
										"Saldo após saque: " + lcc.get(x - 1).removerSaldo(50) + "\nValor sacado: 50");

								String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

								iex = new InterfaceExtrato("-50", date);

								lcc.get(x - 1).addExtratoCC(iex);
							} else if (saque2[result2].equalsIgnoreCase("100")) {
								senhap = JOptionPane.showInputDialog("Por favor insira a senha da conta: ");
								pedirSenha(lcc.get(x - 1).senhacc, senhap);

								JOptionPane.showMessageDialog(null, "Saldo após saque: "
										+ lcc.get(x - 1).removerSaldo(100) + "\nValor sacado: 100");

								String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

								iex = new InterfaceExtrato("-100", date);

								lcc.get(x - 1).addExtratoCC(iex);
							} else if (saque2[result2].equalsIgnoreCase("SAQUE PERSONALIZADO")) {
								Double a = Double
										.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
								if(a <= 0)
								{
									throw new NumeroNegativo("Numero inválido");
								}
								senhap = JOptionPane.showInputDialog("Por favor insira a senha da conta: ");

								pedirSenha(lcc.get(x - 1).senhacc, senhap);

								JOptionPane.showMessageDialog(null,
										"Saldo apos saque: " + lcc.get(x - 1).removerSaldo(a) + "\nValor sacado: " + a);

								String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

								iex = new InterfaceExtrato(String.valueOf(a), date);

								lcc.get(x - 1).addExtratoCC(iex);
							}
						}
						if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
							int result2 = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, saque2, null);
							String senhap = null;

							if (saque2[result2].equalsIgnoreCase("50")) {
								senhap = JOptionPane.showInputDialog("Por favor insira a senha da conta: ");
								pedirSenha(lcp.get(x - 1).senhacp, senhap);

								JOptionPane.showMessageDialog(null,
										"Saldo após saque: " + lcp.get(x - 1).removerSaldo(50) + "\nValor sacado: 50");

								String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

								iex = new InterfaceExtrato("-50", date);

								lcp.get(x - 1).addExtratoCP(iex);
							} else if (saque2[result2].equalsIgnoreCase("100")) {
								senhap = JOptionPane.showInputDialog("Por favor insira a senha da conta: ");
								pedirSenha(lcp.get(x - 1).senhacp, senhap);

								JOptionPane.showMessageDialog(null, "Saldo após saque: "
										+ lcp.get(x - 1).removerSaldo(100) + "\nValor sacado: 100");

								String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

								iex = new InterfaceExtrato("-100", date);

								lcp.get(x - 1).addExtratoCP(iex);
							} else if (saque2[result2].equalsIgnoreCase("SAQUE PERSONALIZADO")) {
								Double a = Double
										.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
								senhap = JOptionPane.showInputDialog("Por favor insira a senha da conta: ");
								pedirSenha(lcp.get(x - 1).senhacp, senhap);

								JOptionPane.showMessageDialog(null, "Saldo após saque: "
										+ lcp.get(x - 1).removerSaldo(a) + "\nValor sacado: " + a);

								String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

								iex = new InterfaceExtrato(String.valueOf(a), date);

								lcp.get(x - 1).addExtratoCP(iex);
							}
						}
					}
					// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					if (options1[resp].equalsIgnoreCase("EXTRATO")) {
						int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja ver o extrato: ", "Tipo",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);
						int x = parseInt(JOptionPane.showInputDialog("Código da conta que deseja ver o extrato: "));

						if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
							if (lcc.get(x - 1) != null) {
								lcc.get(x - 1).mostraExCC();
							} else {
								JOptionPane.showMessageDialog(null, "Essa conta não existe!");
							}

						} else if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
							if (lcc.get(x - 1) != null) {
								lcp.get(x - 1).mostraExCP();
							} else {
								JOptionPane.showMessageDialog(null, "Essa conta não existe!");
							}

						}
					}
					// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

					if (options1[resp].equalsIgnoreCase("TRANSFERENCIA")) {
						int y = JOptionPane.showOptionDialog(null, "Tipo da conta que deseja ver o extrato: ", "Tipo",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, conta2, null);

						if (conta2[y].equalsIgnoreCase("CONTA CORRENTE")) {
							int result = JOptionPane.showOptionDialog(null, "Escolha uma opçãoo", "Menu",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, transferencia,
									null);

							if (transferencia[result].equalsIgnoreCase("FAZER TRANSFERENCIA")) {
								Double a = Double
										.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser Transferido: "));

								int x = parseInt(JOptionPane
										.showInputDialog("CÃ³digo da conta de onde irá¡ ser transferido o dinheiro: "));
								int z = parseInt(JOptionPane.showInputDialog(
										"CÃ³digo da conta para onde irÃ¡ ser transferido o dinheiro: "));

								JOptionPane.showMessageDialog(null,
										"Saldo da conta origem após a transferência: "
												+ lcc.get(x - 1).removerSaldo(a)
												+ "\nSaldo da conta destino após a transferência: "
												+ lcc.get(z - 1).adicionarSaldo(a));
							}
						}
						if (conta2[y].equalsIgnoreCase("CONTA POUPANÇA")) {
							int result = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, transferencia,
									null);

							if (transferencia[result].equalsIgnoreCase("FAZER TRANSFERENCIA")) {
								Double a = Double
										.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser Transferido: "));

								int x = parseInt(JOptionPane
										.showInputDialog("CÃ³digo da conta de onde irá ser transferido o dinheiro: "));
								int z = parseInt(JOptionPane.showInputDialog(
										"CÃ³digo da conta para onde irá ser transferido o dinheiro: "));

								JOptionPane.showMessageDialog(null,
										"Saldo da conta origem apÃ³s a transferência: "
												+ lcp.get(x - 1).removerSaldo(a)
												+ "\nSaldo da conta destino após a transferência: "
												+ lcp.get(z - 1).adicionarSaldo(a));
							}
						}
					}
					exc2 = false;
					// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					deseja = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				
		} while (deseja == 0);
	}

	/**
	 * Método que pede a senha
	 * @param senha String que recebe a senha cadastrada
	 * @param s String que recebe a tentativa da senha
	 */
	
	public static void pedirSenha(String senha, String s) {
		int cont = 0;
		boolean confirm = true;

		if (Objects.equals(senha, s)) {
			confirm = true;
		} else {
			confirm = false;
			cont++;
		}

		boolean c = confirm;
		bloquear(c, cont);
	}
/**
 * Método que determina se a execução será parada
 * @param c Boolean que diz se a senha foi correta
 * @param cont int que conta as tentativas
 */
	
	public static void bloquear(boolean c, int cont) {
		if (c == true && cont < 4) {
			JOptionPane.showMessageDialog(null, ("Senha confirmada"));
		} else {
			throw new NumeroNegativo("Conta Bloqueada");
		}
	}
}