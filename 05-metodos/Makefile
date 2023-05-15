PDF =	\
	pucrs-ep-fprog-unidade_05-metodos-laminas.pdf \
	pucrs-ep-fprog-unidade_05-metodos-lista_de_exercicios.pdf \
	pucrs-ep-fprog-unidade_05-metodos-lista_de_exercicios_2.pdf \
	pucrs-ep-fprog-unidade_05-metodos-trabalho_1.pdf

all:	$(PDF)

%.pdf:	%.tex
	@pdflatex -shell-escape $<
	@pdflatex -shell-escape $<

clean:
	@rm -f *~ *.pyg *.log *.out *.aux *.toc *.nav *.snm *.vrb
	@rm -rf _minted-*
