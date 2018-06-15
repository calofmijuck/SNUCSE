`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    15:26:50 04/04/2018 
// Design Name: 
// Module Name:    multiplexer_structure 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module multiplexer_structure(
    input [3:0] X,
    input [1:0] C,
    output Y
    );
	 
	 wire C0_bar, C1_bar;
	 wire and1, and2, and3, and4;
	 
	 not (C0_bar, C[0]);
	 not (C1_bar, C[1]);
	 
	 and (and1, C0_bar, C1_bar, X[0]);
	 and (and2, C[0], C1_bar, X[1]);
	 and (and3, C0_bar, C[1], X[2]);
	 and (and4, C[0], C[1], X[3]);
	 
	 or (Y, and1, and2, and3, and4);
	
endmodule
