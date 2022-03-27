package com.xwork.digital_wallet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.xwork.digital_wallet.constants.JdbcConstants;
import com.xwork.digital_wallet.dto.DigitalWalletDTO;

public class DigitalWalletDAOImpli implements DigitalWalletDAO {

	@Override
	public int addWalletInBatch(List<DigitalWalletDTO> wallets) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager.getConnection(JdbcConstants.URL,JdbcConstants.USERNAME,JdbcConstants.PASSWORD);
			preparedStatement = connection.prepareStatement("INSERT INTO wallet_details VALUES(?,?,?,?)");
			
			for (DigitalWalletDTO digitalWalletDTO : wallets) {
				preparedStatement.setInt(1, digitalWalletDTO.getWallet_Id());
				preparedStatement.setString(2, digitalWalletDTO.getProviderName());
				preparedStatement.setDouble(3, digitalWalletDTO.getAvailableBalance());
				preparedStatement.setInt(4, digitalWalletDTO.getNoOfTransction());
				
				
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			System.out.println("save successfull");
					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement !=null && connection != null)
					preparedStatement.close();
				connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		

		return 0;
	}

}
