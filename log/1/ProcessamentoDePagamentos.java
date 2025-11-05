
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessamentoDePagamentos {

	// Logger SLF4j
	private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

	public static void main(String[] args) throws InterruptedException {
		
		Random random = new Random();
		for (int i = 1; i < 6; i++) {
			int status = random.nextInt(2); // 0 to 2
			simulaPagamento(i, status);
			Thread.sleep(1000);
		}
	}

	static void simulaPagamento(int index, int status) {
		
		
		logger.info("Iniciando o processamento do pagamento {}", index);
		if (status ==0) {
			logger.error("Erro ao processar o pagamento {}: Falha na transação.", index);	
		} else if (status ==1) {
			logger.info("Pagamento {} processado com sucesso.", index);
		} else {
			logger.warn("Pagamento {} está pendente. Aguardando confirmação.", index);
		}
	}
	

}
